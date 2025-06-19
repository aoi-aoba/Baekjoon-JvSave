import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int N, M, result = 0;
    public static int[][] board;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        initInput();
        searchAll();
        System.out.println(result);    }
    public static void initInput() throws IOException {
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++)
                board[i][j] = str.charAt(j) - '0';
        }
    }
     public static void searchAll() {
        int bits = (1 << (N * M)) - 1;
        for (int bitmask = bits; ; bitmask = (bitmask - 1) & bits) {
            int num = 0, sum = 0;
            for (int i = 0; i < N; i++)  {
                for (int j = 0; j < M; j++) {
                    if ((bitmask & (1 << (i * M + j))) != (1 << (i * M + j)))
                        num = board[i][j] + (num == 0 ? 0 : num * 10);
                    else if (num != 0) {
                        sum += num;
                        num = 0;
                    }
                }
                if (num > 0) sum += num;
                num = 0;
            }
            for (int j = 0; j < M; j++) {
                for (int i = 0; i < N; i++) {
                    if ((bitmask & (1 << (i * M + j))) == (1 << (i * M + j)))
                        num = board[i][j] + (num == 0 ? 0 : num * 10);
                    else if (num != 0) {
                        sum += num;
                        num = 0;
                    }
                }
                if (num > 0) sum += num;
                num = 0;
            }
            result = Math.max(result, sum);
            if (bitmask == 0) break;
        }
     }
}