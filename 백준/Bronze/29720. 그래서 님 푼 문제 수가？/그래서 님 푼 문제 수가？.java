//  그래서 님 푼 문제 수가?

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int r1 = Math.max(0, n - m * k);
        int r2 = Math.max(0, n - m * (k-1) - 1);
        System.out.println(r1 + " " + r2);
    }
}