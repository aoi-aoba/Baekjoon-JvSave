import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static boolean fillAll = false;
    public static int[][] board = new int[9][9];
    public static List<int[]> cellToFind = new ArrayList<>();
    public static boolean isAvailable(int r, int c, int target) {
        for (int i = 0; i < 9; i++)
            if (board[r][i] == target || board[i][c] == target)
                return false;
        int sr = (r / 3) * 3, sc = (c / 3) * 3;
        for (int i = sr; i < sr + 3; i++)
            for (int j = sc; j < sc + 3; j++)
                if (board[i][j] == target) return false;
        return true;
    }
    public static void tracker(int depth) {
        if (depth == N) {
            fillAll = true;
            return;
        }

        int[] cellPos = cellToFind.get(depth);
        int r = cellPos[0], c = cellPos[1];

        for (int i = 1; i <= 9; i++) {
            if (isAvailable(r, c, i)) {
                board[r][c] = i;
                tracker(depth + 1);
                if (fillAll) return;
                board[r][c] = 0;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            String line = br.readLine();
            for (int j = 0; j < 9; j++) {
                board[i][j] = line.charAt(j) - '0';
                if (board[i][j] == 0) cellToFind.add(new int[]{i, j});
            }
        }

        N = cellToFind.size();
        tracker(0);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                out.append(board[i][j]);
            out.append("\n");
        }

        bw.write(out.toString());
        bw.flush();
    }
}