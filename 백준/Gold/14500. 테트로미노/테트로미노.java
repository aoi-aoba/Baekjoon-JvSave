import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int max, M, N;
    public static int[][] paper;
    public static int[][][] tetromino = new int[][][] {
            {{0, 0}, {0, 1}, {0, 2}, {0, 3}},  // 가로 ㅡ 모양
            {{0, 0}, {1, 0}, {2, 0}, {3, 0}},  // 세로 ㅣ 모양
            {{0, 0}, {0, 1}, {1, 0}, {1, 1}},   // ㅁ 모양
            {{0, 0}, {0, 1}, {0, 2}, {1, 1}},  // ㅜ 모양
            {{0, 0}, {1, 0}, {1, 1}, {2, 0}},  // ㅏ 모양
            {{0, 0}, {1, -1}, {1, 0}, {1, 1}},  // ㅗ 모양
            {{0, 0}, {-1, 1}, {0, 1}, {1, 1}},  // ㅓ 모양
            {{0, 0}, {1, 0}, {2, 0}, {2, 1}},   // ㄴ 모양 변형 시작
            {{0, 0}, {1, 0}, {2, 0}, {0, 1}},
            {{0, 0}, {0, 1}, {1, 1}, {2, 1}},
            {{0, 0}, {-2, 1}, {-1, 1}, {0, 1}},
            {{0, 0}, {1, 0}, {0, 1}, {0, 2}},
            {{0, 0}, {0, 1}, {0, 2}, {1, 2}},
            {{0, 0}, {1, -2}, {1, -1}, {1, 0}},
            {{0, 0}, {1, 0}, {1, 1}, {1, 2}},
            {{0, 0}, {0, 1}, {1, -1}, {1, 0}},  // ㄹ 모양 변형 시작
            {{0, 0}, {0, 1}, {1, 1}, {1, 2}},
            {{0, 0}, {1, 0}, {1, 1}, {2, 1}},
            {{0, 0}, {1, 0}, {1, -1}, {2, -1}}
    };
    public static void calculate(int y, int x) { // 넘길 때 x와 y가 서로 뒤집혀서 옴에 주의
        for (int t = 0; t < 19; t++) {
            boolean canBeInside = true;
            int res = 0, dx = 0, dy = 0;
            for (int a = 0; a < 4; a++) {
                dy = y + tetromino[t][a][0];
                dx = x + tetromino[t][a][1];
                if (dx >= 0 && dx < M && dy >= 0 && dy < N)
                    res += paper[dy][dx];
                else canBeInside = false;
            }
            if (canBeInside) max = Math.max(max, res);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        max = 0;
        paper = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                calculate(i, j); // xy 좌표계로 치면 사실상 (y, x)로 넘기는 것

        System.out.println(max);
    }
}