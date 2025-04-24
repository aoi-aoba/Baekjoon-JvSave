import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static BigInteger[] dp;
    public static BigInteger dp(int n) {
        dp = new BigInteger[n+2];
        dp[1] = BigInteger.ONE; dp[2] = BigInteger.ONE;
        for (int i = 3; i <= n+1; i++)
            dp[i] = dp[i-1].add(dp[i-2]);
        return dp[n].add(dp[n+1]).multiply(BigInteger.TWO);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        System.out.println(dp(n));
        br.close();
    }
}