import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int[] dp;
    public static int dp(int N) {
        if (N == 1 || N == 2) return N;
        dp = new int[N+1];
        dp[1] = 1; dp[2] = 2;
        for (int i = 3; i <= N; i++)
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        return dp[N];
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(dp(N));
        br.close();
    }
}