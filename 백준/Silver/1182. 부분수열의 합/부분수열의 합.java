import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken()), set = (1 << N) - 1, res = 0;

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        for (int subset = set; subset > 0; subset = (subset - 1) & set) {
            // set을 모두 켠 상태에서 시작하면 현재 비트마스크보다 하나 작은 수를 만들게 됨
            // 그 과정에서 가장 오른쪽의 1은 0이 되고, 그 오른쪽의 비트가 1이 됨
            // 그리고 set과 비교하여 없는 비트를 날리면 set의 비트 범위에서만 움직이게 됨
            int checkSum = 0;
            for (int i = 0; i < N; i++)
                if ((subset & (1 << i)) == (1 << i)) checkSum += arr[i];
            if (checkSum == S) res++;
        }

        System.out.println(res);
    }
}