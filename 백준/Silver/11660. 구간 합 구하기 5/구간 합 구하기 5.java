import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int[][] sumBoard = new int[N + 1][N + 1];

        Arrays.fill(sumBoard[0], 0);
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            sumBoard[i][0] = 0;
            for (int j = 1; j <= N; j++)
                sumBoard[i][j] = sumBoard[i-1][j] + sumBoard[i][j-1] - sumBoard[i-1][j-1] + Integer.parseInt(st.nextToken());
            // 사각형 범위 내의 누적합 = 해당 사각형의 가로-세로 한 줄씩 무시한 누적합의 합 - 겹쳐 두 번 더해지는 사각 누적합 + 해당 위치값
        }

        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());
            out.append(sumBoard[x2][y2] - sumBoard[x2][y1-1] - sumBoard[x1-1][y2] + sumBoard[x1-1][y1-1]).append("\n");
        }

        bw.write(out.toString());
        bw.flush();
    }
}
