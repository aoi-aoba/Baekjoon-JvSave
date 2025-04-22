import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static long[][] dp = new long[91][2];
    public static long dp(int N) {
        dp[1][0] = dp[2][1] = 0; dp[1][1] = dp[2][0] = 1;
        for (int i = 3; i <= N; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }
        return dp[N][0] + dp[N][1];
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(dp(N));
        br.close();
    }
}