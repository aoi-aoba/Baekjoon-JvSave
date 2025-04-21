import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][] Triangle, dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Triangle = new int[N+1][N+1];
        dp = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++)
                Triangle[i][j] = Integer.parseInt(st.nextToken());
        }

        dp[1][1] = Triangle[1][1];
        for (int i = 2; i <= N; i++)
            for (int j = 1; j <= i; j++)
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + Triangle[i][j];

        int maxVal = 0;
        for (int i = 1; i <= N; i++) maxVal = Math.max(maxVal, dp[N][i]);
        System.out.println(maxVal);
        br.close();
    }
}
