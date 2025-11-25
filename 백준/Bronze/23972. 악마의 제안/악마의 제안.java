//  악마의 제안

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // N(X - K) = X, X(N - 1) = KN, X = KN / (N - 1)
        long k = Long.parseLong(st.nextToken()), n = Long.parseLong(st.nextToken());
        if (n == 1) System.out.println(-1);
        else System.out.println(k * n / (n-1) + (((k * n) % (n-1) != 0) ? 1 : 0));
    }
}