import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int dp(int[][] resource, int N) {
        int[][] dp = new int[N][3];
        dp[1][0] = Math.min(resource[0][1] + resource[1][0], resource[0][2] + resource[1][0]);
        dp[1][1] = Math.min(resource[0][0] + resource[1][1], resource[0][2] + resource[1][1]);
        dp[1][2] = Math.min(resource[0][0] + resource[1][2], resource[0][1] + resource[1][2]);
        for (int i = 2; i < N; i++) {
            dp[i][0] = Math.min(dp[i-1][1] + resource[i][0], dp[i-1][2] + resource[i][0]);
            dp[i][1] = Math.min(dp[i-1][0] + resource[i][1], dp[i-1][2] + resource[i][1]);
            dp[i][2] = Math.min(dp[i-1][0] + resource[i][2], dp[i-1][1] + resource[i][2]);
        }
        return Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] priceWithColor = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++)
                priceWithColor[i][j] = Integer.parseInt(st.nextToken());
        }
        System.out.println(dp(priceWithColor, N));
        br.close();
    }
}