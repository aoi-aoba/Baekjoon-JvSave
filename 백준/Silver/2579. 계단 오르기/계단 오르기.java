import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] stair, dp;
    public static void goUpstairsDP(int N) {
        dp = new int[N];
        dp[0] = stair[0];
        if (N == 1) return;
        dp[1] = stair[0] + stair[1];
        if (N == 2) return;
        dp[2] = Math.max(stair[0]+stair[2], stair[1]+stair[2]);
        for (int i = 3; i < N; i++) {
            int twoStairs = dp[i-2] + stair[i];
            int oneStairs = dp[i-3] + stair[i-1] + stair[i];
            dp[i] = Math.max(twoStairs, oneStairs);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        stair = new int[N];
        for (int i = 0; i < N; i++) stair[i] = Integer.parseInt(br.readLine());
        goUpstairsDP(N);
        System.out.println(dp[N-1]);
        br.close();
    }
}