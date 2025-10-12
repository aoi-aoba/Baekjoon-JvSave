import java.io.*;
import java.util.*;

public class Main {
    public static int target, result = -1;

    public static void bfs(int num) {
        Queue<int[]> Q = new ArrayDeque<>();
        Q.offer(new int[] {num, 1});

        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int curN = cur[0], depth = cur[1];

            if (curN == target) {
                result = depth;
                return;
            }

            long case1 =  curN * 10L + 1, case2 = curN * 2L;
            if (case1 <= target) Q.offer(new int[]{(int)case1, depth + 1});
            if (case2 <= target) Q.offer(new int[]{(int)case2, depth + 1});
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        bfs(a);
        System.out.println(result);
    }
}
