import java.io.*;
import java.util.*;

public class Main {
    public static int[] map;
    public static boolean[] visited;
    public static int n, k;

    public static void bfs(int pos, int time) {
        Queue<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[]{pos, time});
        map[pos] = time;
        visited[pos] = true;

        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int posNow = cur[0], timeNow = cur[1];

            int[] next = {posNow - 1, posNow + 1, posNow * 2};
            for (int nextPos : next) {
                if (nextPos < 0 || nextPos > 100000) continue;
                if (visited[nextPos]) continue;
                visited[nextPos] = true;
                map[nextPos] = timeNow + 1;
                Q.offer(new int[] {nextPos, timeNow + 1});
            }

            if (visited[k]) return;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n == k) System.out.println(0);
        else if (n > k) System.out.println(n - k);
        else {
            map = new int[100001];
            visited = new boolean[100001];
            bfs(n, 0);
            System.out.println(map[k]);
        }
    }
}