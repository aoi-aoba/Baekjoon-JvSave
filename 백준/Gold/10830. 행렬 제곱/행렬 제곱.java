import java.io.*;
import java.util.*;

public class Main {
    public static int N, MOD = 1000;
    public static int[][] matrixMulti(int[][] matA, int[][] matB) {
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                for (int k = 0; k < N; k++)
                    result[i][j] += matA[i][k] * matB[k][j];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                result[i][j] %= MOD;
        return result;
    }

    public static int[][] matrixPow(int[][] matrix, long exp) {
        if (exp == 1) return matrix;
        else {
            int[][] partialMat = matrixPow(matrix, exp / 2);
            if (exp % 2 == 0) return matrixMulti(partialMat, partialMat);
            else return matrixMulti(matrixMulti(partialMat, partialMat), matrix);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                matrix[i][j] = Integer.parseInt(st.nextToken()) % 1000;
        }

        int[][] result = matrixPow(matrix, B);
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                out.append(result[i][j]).append(" ");
            out.append("\n");
        }
        System.out.println(out);
    }
}