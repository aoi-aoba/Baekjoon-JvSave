import java.io.*;
import java.util.*;

public class Main {
    public static int N, K;
    public static int[] map = new int[100001];
    public static boolean isFirstVisit(int pos) {
        return map[pos] == -1;
    }
    public static int bfs() {
        Arrays.fill(map, -1);
        Queue<int[]> Q = new PriorityQueue<>(Comparator.comparingInt(cur -> cur[1]));
        Q.add(new int[]{N, 0});

        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int pos = cur[0], time = cur[1];
            map[pos] = time;
            if (pos == K) break;

            if (pos * 2 <= 100000 && isFirstVisit(pos * 2))
                Q.add(new int[]{pos * 2, time});
            if (pos - 1 >= 0 && isFirstVisit(pos - 1))
                Q.add(new int[]{pos - 1, time + 1});
            if (pos + 1 <= 100000 && isFirstVisit(pos + 1))
                Q.add(new int[]{pos + 1, time + 1});
        }

        return map[K];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        System.out.println(bfs());
    }
}