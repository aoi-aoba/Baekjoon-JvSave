import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static BigInteger[] dp = new BigInteger[10001];
    public static void dp() {
        Arrays.fill(dp, BigInteger.valueOf(0));
        dp[1] = BigInteger.ONE; dp[2] = BigInteger.ONE;
        for (int i = 2; i < 10001; i++)
            dp[i] = dp[i-2].add(dp[i-1]);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp();
        System.out.println(dp[N]);
        br.close();
    }
}