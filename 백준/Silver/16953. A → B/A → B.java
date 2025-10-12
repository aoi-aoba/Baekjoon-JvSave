import java.io.*;
import java.util.*;

public class Main {
    public static int MAX = 1_000_000_001;
    public static int target, result = 0;
    public static boolean[] visited = new boolean[MAX];

    public static void bfs(int num) {
        Queue<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[] {num, 1});
        visited[num] = true;

        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int curN = cur[0], depth = cur[1];
            visited[curN] = true;
            result = depth;

            if (curN == target) break;
            if (curN <= (MAX - 1) / 10) {
                int newNum = curN * 10 + 1;
                Q.offer(new int[]{newNum, depth + 1});
            }
            if (curN <= (MAX / 2)) {
                int newNum = curN * 2;
                Q.offer(new int[]{newNum, depth + 1});
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        bfs(a);
        System.out.println(!visited[target] ? -1 : result);
    }
}
