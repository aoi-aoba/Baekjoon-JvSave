import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] dp;
    public static int dp(int N) {
        if (N == 1) return 0;
        dp = new int[N+1];
        dp[1] = 0;
        for (int i = 2; i <= N; i++)
            dp[i] = dp[i-1] + i - 1;
        return dp[N];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(dp(Integer.parseInt(br.readLine())));
        br.close();
    }
}