import java.io.*;
import java.util.*;

public class Main {
    public static int MOD = 1_000_000_007;
    public static long powMod(long base, long exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod; // 홀수인 경우
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
    public static long mod_inverse(long n, int p) {
        return powMod(n, p-2, p);
    }
    public static long[] precomputeFact(int n, int p) {
        long[] fact = new long[n + 1];
        fact[0] = fact[1] = 1;
        for (int i = 2; i < n+1; i++)
            fact[i] = (fact[i - 1] * i) % p;
        return fact;
    }
    public static long combModP(int n, int r, int p) {
        if (r > n) return 0;
        long[] fact = precomputeFact(n, p);
        return fact[n] * mod_inverse(fact[r], p) % p * mod_inverse(fact[n-r], p) % p;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken());
        System.out.println(combModP(N, R, MOD));
    }
}