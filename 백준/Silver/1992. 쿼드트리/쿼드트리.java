import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] data;
    static StringBuilder res = new StringBuilder();
    public static void quadPress(int startI, int endI, int startJ, int endJ) {
        int zero = 0, one = 0;
        for (int i = startI; i < endI; i++) {
            for (int j = startJ; j < endJ; j++) {
                if (data[i][j] == 0) zero++;
                else one++;
            }
        }
        if (zero == 0) {
            res.append(1);
            return;
        } else if (one == 0) {
            res.append(0);
            return;
        } else {
            int midI = (startI + endI) / 2, midJ = (startJ + endJ) / 2;
            res.append('(');
            quadPress(startI, midI, startJ, midJ);
            quadPress(startI, midI, midJ, endJ);
            quadPress(midI, endI, startJ, midJ);
            quadPress(midI, endI, midJ, endJ);
            res.append(')');
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        data = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++)
                data[i][j] = str.charAt(j) - '0';
        }

        quadPress(0, N, 0, N);
        System.out.println(res);
    }
}