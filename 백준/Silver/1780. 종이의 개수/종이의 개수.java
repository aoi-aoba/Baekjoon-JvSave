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
                    case 0 -> zero++;
                    case 1 -> one++;
                    default -> minus++;
                }

        if (zero == 0 && one == 0) minusT++;
        else if (minus == 0 && one == 0) zeroT++;
        else if (minus == 0 && zero == 0) oneT++;
        else {
            int lenI = (endI - startI) / 3, lenJ = (endJ - startJ) / 3;
            nineDiv(startI, startI + lenI, startJ, startJ + lenJ);
            nineDiv(startI, startI + lenI, startJ + lenJ, startJ + 2*lenJ);
            nineDiv(startI, startI + lenI, startJ + 2*lenJ, endJ);

            nineDiv(startI + lenI, startI + 2*lenI, startJ, startJ + lenJ);
            nineDiv(startI + lenI, startI + 2*lenI, startJ + lenJ, startJ + 2*lenJ);
            nineDiv(startI + lenI, startI + 2*lenI, startJ + 2*lenJ, endJ);

            nineDiv(startI + 2*lenI, endI, startJ, startJ + lenJ);
            nineDiv(startI + 2*lenI, endI, startJ + lenJ, startJ + 2*lenJ);
            nineDiv(startI + 2*lenI, endI, startJ + 2*lenJ, endJ);
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