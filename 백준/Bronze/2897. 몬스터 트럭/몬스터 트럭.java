import java.io.*;
import java.util.*;

public class Main {
    public static int checkType(char ch) {
        switch (ch) {
            case '#':
                return 0;
            case 'X':
                return 1;
            default :
                return 2;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());

        char[][] board = new char[r][c];
        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        int[] res = new int[5];
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                int[] arr = new int[3];

                arr[checkType(board[i][j])]++;
                arr[checkType(board[i+1][j])]++;
                arr[checkType(board[i][j+1])]++;
                arr[checkType(board[i+1][j+1])]++;

                if (arr[0] == 0) res[arr[1]]++;
            }
        }

        out.append(res[0]).append("\n").append(res[1]).append("\n").append(res[2]).append("\n")
                        .append(res[3]).append("\n").append(res[4]).append("\n");

        bw.write(String.valueOf(out));
        bw.flush();
    }
}