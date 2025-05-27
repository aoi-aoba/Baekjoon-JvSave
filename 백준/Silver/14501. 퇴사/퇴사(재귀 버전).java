import java.io.*;
import java.util.*;

public class Main {
    public static int N, result = 0;
    public static int[][] timePayTable;
    public static void tracker(int nowWatching, int nowPay) {
        if (nowWatching == N) {
            result = Math.max(result, nowPay);
            return;
        } else for (int i = nowWatching; i < N; i++) {
            if (i + timePayTable[i][0] <= N)
                tracker(i + timePayTable[i][0], nowPay + timePayTable[i][1]);
            else tracker(i+1, nowPay);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        timePayTable = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            timePayTable[i][0] = Integer.parseInt(st.nextToken()); // time
            timePayTable[i][1] = Integer.parseInt(st.nextToken()); // pay
        }

        tracker(0, 0);
        System.out.print(result);
        br.close();
    }
}
