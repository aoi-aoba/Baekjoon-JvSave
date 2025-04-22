import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static long[] dp = new long[1001];
    public static long dp(int N) {
        dp[1] = 1; dp[2] = 3;
        for (int i = 3; i <= N; i++)
            dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
        return dp[N];
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(dp(N));
        br.close();
    }
}