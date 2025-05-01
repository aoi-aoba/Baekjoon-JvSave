import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] wineCup;
    public static int dp() {
        if (wineCup.length == 1) return wineCup[0];
        else if (wineCup.length == 2) return wineCup[0] + wineCup[1];
        int[] dp = new int[wineCup.length];
        dp[0] = wineCup[0];
        dp[1] = wineCup[0] + wineCup[1];
        for (int i = 2; i < wineCup.length; i++) {
            int xoo = (i == 2) ? wineCup[i-1] + wineCup[i] : dp[i-3] + wineCup[i-1] + wineCup[i];
            int xo = dp[i-2] + wineCup[i];
            int ox = dp[i-1];
            dp[i] = Math.max(xoo, Math.max(xo, ox));
        }
        return dp[wineCup.length-1];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        wineCup = new int[N];
        for (int i = 0; i < N; i++) wineCup[i] = Integer.parseInt(br.readLine());
        System.out.println(dp());
        br.close();
    }
}