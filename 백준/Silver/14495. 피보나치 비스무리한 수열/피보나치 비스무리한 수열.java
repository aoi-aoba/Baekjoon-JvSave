import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static long[] dp;
    public static long dp(int n) {
        if (n <= 3) return 1;
        dp = new long[n+1];
        dp[1] = 1; dp[2] = 1; dp[3] = 1;
        for (int i = 3; i <= n; i++)
            dp[i] = dp[i-1] + dp[i-3];
        return dp[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        System.out.println(dp(n));
        br.close();
    }
}