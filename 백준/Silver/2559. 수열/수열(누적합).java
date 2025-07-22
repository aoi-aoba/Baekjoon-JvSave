import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int sum = 0;
        for (int i = 0; i < K; i++) sum += arr[i];
        int result = sum;

        for (int i = K; i < N; i++) {
            sum += arr[i] - arr[i - K];
            result = Math.max(result, sum);
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
