import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        int result = 0, T = Integer.parseInt(br.readLine());
        boolean[][] board = new boolean[101][101];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
            for (int j = p; j < p + 10; j++)
                for (int k = q; k < q + 10; k++)
                    board[j][k] = true;
        }

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (i == 0) {
                    if (board[i][j]) result++;
                } else if (board[i-1][j] ^ board[i][j]) result++;
                if (j == 0) {
                    if (board[i][j]) result++;
                } else if (board[i][j-1] ^ board[i][j]) result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}