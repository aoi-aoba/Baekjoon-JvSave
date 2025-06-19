import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] input, dp;
    public static int tracker(int n) {
        int result = input[0];
        dp[0] = input[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(input[i], dp[i - 1] + input[i]);
            result = Math.max(dp[i], result);
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        dp = new int[N];
        input = new int[N];
        for (int i = 0; i < N; i++) input[i] = Integer.parseInt(st.nextToken());
        System.out.println(tracker(N));
    }
}
