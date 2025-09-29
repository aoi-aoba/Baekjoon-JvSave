import java.io.*;
import java.util.*;

public class Main {
    public static int n, k;
    public static long res = 1;
    public static int[] rem;
    public static final int MOD = 1_000_000_007;
    public static long fastModPow(long base, long exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1)
                res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        rem = new int[k];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            rem[Integer.parseInt(st.nextToken()) % k]++;

        for (int i = 1; i <= k / 2; i++) {
            int j = k - i;
            if (i > j) continue;
            if (i == j)
                res = res * (1 + rem[i]) % MOD;
            else {
                long ways = (fastModPow(2, rem[i]) + fastModPow(2, rem[j]) - 1 + MOD) % MOD;
                res = res * ways % MOD;
            }
        }

        res = res * (1 + rem[0]) % MOD;
        res = (res - 1 - n) % MOD;
        if (res < 0) res += MOD;

        System.out.println(res);
    }
}