import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] dp;
    public static int dp(int N) {
        if (N == 0) return 1;
        dp = new int[N+1];
        dp[0] = 1; dp[1] = 1;
        for (int i = 2; i <= N; i++) dp[i] = dp[i-1] + dp[i-2];
        return dp[N];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++)
            System.out.println(dp(Integer.parseInt(br.readLine())));
        br.close();
    }
}