import java.io.*;
import java.util.*;

public class Main {
    static char[][] board, pat;
    static StringBuilder res = new StringBuilder();
    public static void setBoard(int N) {
        board = new char[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = pat[i % 4][j % 4];
    }
    public static void print(char[][] printingBoard) {
        for (int i = 0; i < printingBoard.length; i++) {
            for (int j = 0; j < printingBoard[i].length; j++)
                res.append(printingBoard[i][j]);
            res.append("\n");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        pat = new char[][] {{'d', 'a', 'a', 'a'}, {'d', 'd', 'a', 'b'},
                {'d', 'c', 'b', 'b'}, {'c', 'c', 'c', 'b'}};
        int N = Integer.parseInt(br.readLine());

        if (N == 4) print(pat);
        else if (N % 4 == 0) {
            setBoard(N);
            print(board);
        } else res.append("-1");

        System.out.print(res);
    }
}
