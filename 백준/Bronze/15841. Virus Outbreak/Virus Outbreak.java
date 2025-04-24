import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static BigInteger[] dp;
    public static BigInteger dp(int N) {
        if (N == 1) return BigInteger.ONE;
        dp = new BigInteger[N+1];
        dp[1] = BigInteger.ONE; dp[2] = BigInteger.ONE;
        for (int i = 3; i <= N; i++) dp[i] = dp[i-1].add(dp[i-2]);
        return dp[N];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            else {
                System.out.println("Hour " + n + ": " + dp(n) + " cow(s) affected");
                cnt++;
            }
        }
        br.close();
    }
}