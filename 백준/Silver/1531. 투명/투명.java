//  투명

import java.util.*;
import java.io.*;

public class Main {
    public static int n, m, lx, ly, rx, ry;
    public static int[][] board = new int[101][101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            lx = Integer.parseInt(st.nextToken());
            ly = Integer.parseInt(st.nextToken());
            rx = Integer.parseInt(st.nextToken());
            ry = Integer.parseInt(st.nextToken());
            for (int a = lx; a <= rx; a++) {
                for (int b = ly; b <= ry; b++) {
                    board[a][b]++;
                }
            }
        }

        int res = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (board[i][j] > m) res++;
            }
        }

        System.out.println(res);
    }
}