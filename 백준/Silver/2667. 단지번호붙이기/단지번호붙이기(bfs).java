import java.io.*;
import java.util.*;

public class Main {
    public static int[][] map;
    public static boolean[][] check;
    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};
    public static int n;

    public static int bfs(int startX, int startY) {
        Queue<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[]{startX, startY});
        check[startY][startX] = true;
        int cnt = 1;

        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int x = cur[0], y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[ny][nx] == 1 && !check[ny][nx]) {
                    check[ny][nx] = true;
                    cnt++;
                    Q.offer(new int[]{nx, ny});
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        check = new boolean[n][n];

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = temp.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !check[i][j]) {
                    int spaceSize = bfs(j, i);
                    list.add(spaceSize);
                }
            }
        }

        Collections.sort(list);
        bw.write(list.size() + "\n");
        for (int spaceSize : list) bw.write(spaceSize + "\n");
        bw.flush();
    }
}
