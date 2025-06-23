import java.io.*;
import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        while(b > 0) {
            int store_b = b;
            b = a % b;
            a = store_b;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            int k = x, lcm = M * N / gcd(M, N);
            while (k <= lcm) {
                if ((k - 1) % N + 1 == y) break;
                k += M;
            }
            if (k > lcm) System.out.println(-1);
            else System.out.println(k);
        }
    }
}