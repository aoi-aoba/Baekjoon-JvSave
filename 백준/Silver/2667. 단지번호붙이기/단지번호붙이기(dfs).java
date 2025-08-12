import java.io.*;
import java.util.*;

public class Main {
    public static int[][] map;
    public static boolean[][] check;
    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};
    public static int n, space = 1;

    public static void dfs(int x, int y) {
        check[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i], ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[ny][nx] == 1 && !check[ny][nx]) {
                space++;
                dfs(nx, ny);
            }
        }
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
                map[i][j] = (int)temp.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !check[i][j]) {
                    dfs(j, i);
                    list.add(space);
                    space = 1;
                }
            }
        }

        Collections.sort(list);
        bw.write(list.size() + "\n");
        for (int spaceSize : list) bw.write(spaceSize + "\n");
        bw.flush();
    }
}
