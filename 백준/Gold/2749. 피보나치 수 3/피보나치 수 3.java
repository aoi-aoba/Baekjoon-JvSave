//  피보나치 수 3

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int lm = 1_500_000;
        long[] dp = new long[lm + 1];
        dp[1] = 1;
        for (int i = 2; i <= lm; i++)
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1_000_000;
        System.out.println(dp[(int)(n % lm)]);
    }
}