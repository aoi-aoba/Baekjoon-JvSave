import java.io.*;
import java.util.*;

public class Main {
    public static boolean[][] map, check;
    public static List<int[]> baechu;
    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};
    public static int m, n, k, worms = 0;

    public static void dfs(int startX, int startY) {
        check[startY][startX] = true;
        for (int i = 0; i < 4; i++) {
            int nx = startX + dx[i], ny = startY + dy[i];
            if (nx >= 0 && nx < m && ny >= 0 && ny < n && map[ny][nx] && !check[ny][nx]) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            map = new boolean[n][m];
            check = new boolean[n][m];
            baechu = new ArrayList<>();

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
                // 입력은 x-y 좌표축으로 주어짐
                baechu.add(new int[]{x, y});
                map[y][x] = true;
            }

            for (int i = 0; i < k; i++) {
                if (!check[baechu.get(i)[1]][baechu.get(i)[0]]) {
                    dfs(baechu.get(i)[0], baechu.get(i)[1]);
                    worms++;
                }
            }

            sb.append(worms).append("\n");
            worms = 0;
        }

        bw.write(sb.toString());
        bw.flush();
    }
}