import java.io.*;
import java.util.*;

public class Main {
    public static int[][] matrix, target;
    public static void convMatrix(int initY, int initX) {
        for (int i = initY; i <= initY + 2; i++)
            for (int j = initX; j <= initX + 2; j++)
                matrix[i][j] = matrix[i][j] == 0 ? 1 : 0;
    }
    public static boolean checkAllMatrixEqual() {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] != target[i][j]) return false;
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), convertCnt = 0;
        matrix = new int[N][M];
        target = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++)
                matrix[i][j] = str.charAt(j) - '0';
        }

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++)
                target[i][j] = str.charAt(j) - '0';
        }

        if (N < 3 || M < 3) {
            System.out.println(checkAllMatrixEqual() ? 0 : -1);
            return;
        }

        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < M - 2; j++) {
                if (matrix[i][j] == target[i][j]) continue;
                else {
                    convertCnt++;
                    convMatrix(i, j);
                }
            }
        }

        if (!checkAllMatrixEqual()) out.append(-1);
        else out.append(convertCnt);

        bw.write(out.toString());
        bw.flush();
    }
}