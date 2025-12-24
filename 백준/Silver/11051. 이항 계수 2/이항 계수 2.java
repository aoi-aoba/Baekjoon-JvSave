//  이항 계수 2

import java.util.*;
import java.io.*;

public class Main {
    public static int MOD = 10007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[1001][1001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

        for (int n = 1; n <= N; n++) {
            for (int k = 0; k <= n; k++) {
                if (k > K) break;
                if (n == 1 || k == 0 || k == n) arr[n][k] = 1;
                else arr[n][k] = (arr[n-1][k-1] + arr[n-1][k]) % MOD;
            }
        }

        System.out.println(arr[N][K]);
    }
}