import java.io.*;
import java.util.*;

public class Main {
    static int N, minusT, zeroT, oneT;
    static int[][] data;

    public static void nineDiv(int startI, int endI, int startJ, int endJ) {
        int minus = 0, zero = 0, one = 0;
        for (int i = startI; i < endI; i++)
            for (int j = startJ; j < endJ; j++)
                switch(data[i][j]) {
                    case 0:
                        zero++;
                        break;
                    case 1:
                        one++;
                        break;
                    default:
                        minus++;
                }

        if (zero == 0 && one == 0) minusT++;
        else if (minus == 0 && one == 0) zeroT++;
        else if (minus == 0 && zero == 0) oneT++;
        else {
            int lenI = (endI - startI) / 3, lenJ = (endJ - startJ) / 3;
            for (int di = 0; di < 3; di++)
                for (int dj = 0; dj < 3; dj++)
                    nineDiv(startI + di*lenI, startI + (di+1)*lenI,
                            startJ + dj*lenJ, startJ + (dj+1)*lenJ);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        data = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                data[i][j] = Integer.parseInt(st.nextToken());
        }

        nineDiv(0, N, 0, N);
        System.out.println(minusT + "\n" + zeroT + "\n" + oneT);
    }
}