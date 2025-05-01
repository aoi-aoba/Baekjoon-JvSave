import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int[][] dp;
    public static int dp(int N) {
        if(N == 1) return 9;
        dp = new int[N+1][10];
        dp[1][0] = 0;
        Arrays.fill(dp[1], 1, 10,1);
        for (int i = 2; i <= N; i++)
            for (int j = 0; j <= 9; j++)
                dp[i][j] = switch (j) {
                    case 1 -> (dp[i-1][2] + dp[i-1][0]) % 1000000000;
                    case 2 -> (dp[i-1][3] + dp[i-1][1]) % 1000000000;
                    case 3 -> (dp[i-1][4] + dp[i-1][2]) % 1000000000;
                    case 4 -> (dp[i-1][5] + dp[i-1][3]) % 1000000000;
                    case 5 -> (dp[i-1][6] + dp[i-1][4]) % 1000000000;
                    case 6 -> (dp[i-1][7] + dp[i-1][5]) % 1000000000;
                    case 7 -> (dp[i-1][8] + dp[i-1][6]) % 1000000000;
                    case 8 -> (dp[i-1][9] + dp[i-1][7]) % 1000000000;
                    case 9 -> dp[i-1][8] % 1000000000;
                    case 0 -> dp[i-1][1] % 1000000000;
                    default -> 0;
                };
        long res = 0;
        for (int i = 0; i < 10; i++) {
            res += dp[N][i];
        }
        return (int)(res % 1000000000L);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(dp(N));
        br.close();
    }
}