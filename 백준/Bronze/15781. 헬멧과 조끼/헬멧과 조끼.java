import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int[] helmetArr = new int[N], vestArr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) helmetArr[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) vestArr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(helmetArr);
        Arrays.sort(vestArr);
        System.out.println(helmetArr[N - 1] + vestArr[M - 1]);
        br.close();
    }
}