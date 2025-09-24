import java.io.*;
import java.util.*;

public class Main {
    public static double res;
    public static int N, xSum, ySum;
    public static boolean[] visited;
    public static ArrayList<int[]> points;
    public static void tracker(int depth, int xPSum, int yPsum, int lastIdx) {
        if (depth == N / 2) {
            long dx = 2L * xPSum - xSum, dy = 2L * yPsum - ySum;
            res = Math.min(res, Math.sqrt(dx * dx + dy * dy));
            return;
        }
        for (int i = lastIdx; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                int[] curP = points.get(i);
                tracker(depth + 1, xPSum + curP[0], yPsum + curP[1], i);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            visited = new boolean[N];
            points = new ArrayList<>();
            xSum = 0;
            ySum = 0;
            res = Double.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
                xSum += x;
                ySum += y;
                points.add(new int[] {x, y});
            }

            tracker(0, 0, 0, 0);
            System.out.println(res);
        }
    }
}