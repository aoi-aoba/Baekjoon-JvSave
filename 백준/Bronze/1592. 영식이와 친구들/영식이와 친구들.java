import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken());
        if(M == 1) {
            System.out.println(0);
            return;
        }

        int now = 1, cnt = 0;
        int[] arr = new int[N + 1];
        Arrays.fill(arr, 0);
        arr[1] = 1;

        while(true) {
            int temp = now + L;
            if(temp < 0) temp += N;
            else if(temp > N) temp -= N;
            arr[temp]++;
            cnt++;
            if(arr[temp] == M) break;
            else now = temp;
        }

        System.out.println(cnt);
        br.close();
    }
}