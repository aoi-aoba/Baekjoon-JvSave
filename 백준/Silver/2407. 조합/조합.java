//  조합

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        BigInteger[][] comb = new BigInteger[101][101];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    comb[i][j] = BigInteger.ONE;
                else
                    comb[i][j] = comb[i-1][j-1].add(comb[i-1][j]);
            }
        }

        System.out.println(comb[n][m]);
    }
}