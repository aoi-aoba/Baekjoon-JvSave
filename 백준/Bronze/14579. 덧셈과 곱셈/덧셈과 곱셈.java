import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] dp;
    public static int dpAlg(int a, int b) {
        dp = new int[Math.max(a, b) + 1];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++)
            dp[i] = dp[i-1] + i;
        int res = 1;
        for (int i = a; i <= b; i++) {
            res *= dp[i];
            res %= 14579;
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        System.out.println(dpAlg(a, b));
        br.close();
    }
}