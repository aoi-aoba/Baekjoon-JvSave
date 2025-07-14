import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        boolean[][] arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) == 'O';
            }
        }

        for (int i = 0; i < M; i++) {
            boolean canEscape = true;
            for (int j = 0; j < N; j++)
                if (arr[j][i]) {
                    canEscape = false;
                    break;
                }
            if (canEscape) {
                bw.write(String.valueOf(i + 1));
                bw.flush();
                return;
            } else continue;
        }

        bw.write("ESCAPE FAILED");
        bw.flush();
    }
}