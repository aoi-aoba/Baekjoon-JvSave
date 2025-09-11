import java.io.*;
import java.util.*;

public class Main {
    public static int MOD = 1_000_000_007;
    public static int[][] matrixMulti(int[][] matA, int[][] matB) {
        int[][] result = new int[2][2];
        result[0][0] = (int) ((((long) matA[0][0] * matB[0][0]) % MOD) + ((long) matA[0][1] * matB[1][0]) % MOD) % MOD;
        result[0][1] = (int) ((((long) matA[0][0] * matB[0][1]) % MOD) + ((long) matA[0][1] * matB[1][1]) % MOD) % MOD;
        result[1][0] = (int) ((((long) matA[1][0] * matB[0][0]) % MOD) + ((long) matA[1][1] * matB[1][0]) % MOD) % MOD;
        result[1][1] = (int) ((((long) matA[1][0] * matB[0][1]) % MOD) + ((long) matA[1][1] * matB[1][1]) % MOD) % MOD;
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
        long N = Long.parseLong(st.nextToken());

        int[][] defMatrix = new int[][]{{1, 1}, {1, 0}};
        int[][] result = matrixPow(defMatrix, N);
        System.out.println(result[0][1]);
    }
}