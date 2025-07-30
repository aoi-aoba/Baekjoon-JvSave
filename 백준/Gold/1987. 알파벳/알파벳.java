import java.io.*;
import java.util.*;

public class Main {
    public static int row, col, max = 0;
    public static boolean[] visited = new boolean[26];
    public static char[][] board;
    public static int[][] xyControl = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void moveHorse(int depth, int rowNum, int colNum) {
        if (rowNum < 0 || colNum < 0 || rowNum >= row || colNum >= col) return;
        if (visited[board[rowNum][colNum] - 'A']) return;
        max = Math.max(max, depth);

        visited[board[rowNum][colNum] - 'A'] = true;
        for (int i = 0; i < 4; i++)
            moveHorse(depth + 1, rowNum + xyControl[i][0], colNum + xyControl[i][1]);
        visited[board[rowNum][colNum] - 'A'] = false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        board = new char[row][col];

        for (int r = 0; r < row; r++) {
            String temp = br.readLine();
            for (int c = 0; c < col; c++) {
                board[r][c] = temp.charAt(c);
            }
        }

        moveHorse(1, 0, 0);
        bw.write(String.valueOf(max));
        bw.flush();
    }
}