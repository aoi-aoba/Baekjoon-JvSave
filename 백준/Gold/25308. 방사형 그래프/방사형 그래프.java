import java.io.*;
import java.util.*;

public class Main {
    static final int SIZE = 8;
    static int cnt = 0;
    static int[] stats = new int[SIZE], set = new int[SIZE];
    static boolean[] visited = new boolean[SIZE];
    public static boolean isConvex(int a1, int a2, int a3) {
        return a2 > Math.sqrt(2) * a1 * a3 / (a1 + a3);
    }
    public static void tracker(int depth) {
        if (depth == SIZE) {
            boolean flag = true;
            for (int i = 0; i < SIZE; i++) {
                if (!isConvex(set[i], set[(i + 1) % 8], set[(i + 2) % 8])) {
                    flag = false;
                    break;
                }
            }
            if (flag) cnt++;
            return;
        }
        for (int i = 0; i < SIZE; i++) {
            if (!visited[i]) {
                visited[i] = true;
                set[depth] = stats[i];
                tracker(depth + 1);
                set[depth] = 0;
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < SIZE; i++) stats[i] = Integer.parseInt(st.nextToken());
        tracker(0);
        System.out.println(cnt);
    }
}