//  소수&팰린드롬

import java.util.*;
import java.io.*;

public class Main {
    public static boolean[] isPrime = new boolean[100_000_001];
    public static boolean isPalindrome(int n) {
        String ntos = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for (int i = ntos.length() - 1; i >= 0; i--) {
            sb.append(ntos.charAt(i));
        }
        return sb.toString().equals(ntos);
    }
    public static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= 10000; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j <= 100_000_000; j += i) {
                if (isPrime[j]) isPrime[j] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sieve();
        int N = Integer.parseInt(br.readLine());
        int i = N;
        while (true) {
            if (isPrime[i] && isPalindrome(i)) {
                System.out.println(i);
                return;
            } else i++;
        }
    }
}