import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int[] packs, dp;
    public static int tracker() {
        dp = new int[N+1];
        dp[0] = 0;
        for (int n = 1; n <= N; n++) {
            for (int i = 1; i <= n; i++)
                dp[n] = Math.max(dp[n], packs[i] + dp[n-i]);
            // n장의 카드를 산다고 한다면, n 이하의 i장의 카드팩을 사고 남은 n-i장을 가장 비싸게 사는 최댓값을 취한다
            // 가령, n = 5라면 (i, n-i)를 (1, 4) (2, 3) (3, 2) (4, 1) (5, 0)을 체크하는 것.
        }
        return dp[N];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        packs = new int[N + 1];
        for (int i = 1; i <= N; i++) packs[i] = Integer.parseInt(st.nextToken());
        System.out.println(tracker());
    }
}
