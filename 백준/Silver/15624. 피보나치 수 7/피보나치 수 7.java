import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] dp;
    public static int dp(int N) {
        if (N <= 1) return N;
        dp = new int[N+1];
        dp[0] = 0; dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            long temp = dp[i-1] + dp[i-2];
            dp[i] = (int)(temp % 1000000007);
        }
        return dp[N];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(dp(Integer.parseInt(br.readLine())));
        br.close();
    }
}