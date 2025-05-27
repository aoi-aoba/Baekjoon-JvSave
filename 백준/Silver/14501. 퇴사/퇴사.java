import java.io.*;
import java.util.*;

public class Main {
    public static int[][] dpTable;
    public static int[] resultTable;
    public static int dp(int N) {
        int result = 0;
        resultTable = new int[N+1];
        for (int i = 0; i < N; i++) {
            if (i != 0) resultTable[i] = Math.max(resultTable[i], resultTable[i-1]);
            if (i + dpTable[i][0] <= N) {
                resultTable[i + dpTable[i][0]] = Math.max(resultTable[i + dpTable[i][0]], resultTable[i] + dpTable[i][1]);
                result = Math.max(resultTable[i + dpTable[i][0]], result);
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        dpTable = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            dpTable[i][0] = Integer.parseInt(st.nextToken()); // time
            dpTable[i][1] = Integer.parseInt(st.nextToken()); // pay
        }

        System.out.print(dp(N));
        br.close();
    }
}
