//  골드바흐의 추측

import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static boolean[] primes = new boolean[10101];
    public static void sieve() {
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i <= Math.sqrt(10101); i++) {
            if (!primes[i]) continue;
            for (int j = i * 2; j < 10101; j += i)
                if (primes[j]) primes[j] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        sieve();

        while (n-- > 0) {
            int t = Integer.parseInt(br.readLine());
            for (int i = t / 2; i >= 2; i--) {
                if (primes[i] && primes[t - i]) {
                    sb.append(i).append(" ").append(t - i).append("\n");
                    break;
                }
            }
        }

        System.out.println(sb);

    }
}