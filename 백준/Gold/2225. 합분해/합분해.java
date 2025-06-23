import java.io.*;
import java.util.*;

public class Main {
    public static int[][] dp;
    public static int tracker(int row, int col) {
        dp = new int[row+1][col+1];
        Arrays.fill(dp[1], 1);
        for (int i = 2; i <= row; i++)
            for (int j = 1; j <= col; j++)
                dp[i][j] = (dp[i-1][j] + (j == 1 ? 1 : dp[i][j-1])) % 1000000000;
        return dp[row][col];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        System.out.println(tracker(K, N) % 1000000000);
    }
}