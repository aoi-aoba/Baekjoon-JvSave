import java.io.*;
import java.util.*;

public class Main {
    static int lineNum = 0;
    static boolean leftStart = false, rightStart = false;
    static List<Integer> checkedRow = new ArrayList<>(), checkedCol = new ArrayList<>();
    static boolean[][] boardCheck = new boolean[5][5];
    public static void CheckRow(int rowNum) {
        if (checkedRow.contains(rowNum)) return;
        for (int i = 0; i < 5; i++)
            if (!boardCheck[rowNum][i]) return;
        checkedRow.add(rowNum);
        lineNum++;
    }
    public static void CheckCol(int colNum) {
        if (checkedCol.contains(colNum)) return;
        for (int i = 0; i < 5; i++)
            if (!boardCheck[i][colNum]) return;
        checkedCol.add(colNum);
        lineNum++;
    }
    public static void CheckDiagonalLeft() {
        for (int i = 0; i < 5; i++)
            if (!boardCheck[i][i]) return;
        leftStart = true;
        lineNum++;
    }
    public static void CheckDiagonalRight() {
        for (int i = 4; i >= 0; i--)
            if (!boardCheck[4 - i][i]) return;
        rightStart = true;
        lineNum++;
    }
    public static boolean CheckPositionBingo(int[] position) {
        CheckRow(position[0]);
        CheckCol(position[1]);
        if (!leftStart) CheckDiagonalLeft();
        if (!rightStart) CheckDiagonalRight();
        if (lineNum >= 3) return true;
        else return false;
     }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, int[]> boardPos = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++)
                boardPos.put(Integer.parseInt(st.nextToken()), new int[]{i, j});
        }

        int targetNum = 0;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                targetNum++;
                int[] pos = boardPos.get(Integer.parseInt(st.nextToken()));
                boardCheck[pos[0]][pos[1]] = true;
                if (CheckPositionBingo(pos)) {
                    bw.write(String.valueOf(targetNum));
                    bw.flush();
                    return;
                }
            }
        }
    }
}