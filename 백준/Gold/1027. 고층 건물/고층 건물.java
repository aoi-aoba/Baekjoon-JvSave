import java.io.*;
import java.util.*;

public class Main {
    public static int N, map[];
    public static double slope(int x1, int y1, int x2, int y2, int lr) {
        if (lr == 0) return (y2-y1) / (double) (x1-x2);
        else return (y2-y1) / (double) (x2-x1);
    }
    public static int exploreLeft(int idx) {
        int cnt = 0;
        double dm = -Double.MAX_VALUE;
        for (int i = idx - 1; i > 0; i--) {
            double d = slope(idx, map[idx], i, map[i], 0);
            if (d > dm) {
                dm = d;
                cnt++;
            }
        }
        return cnt;
    }
    public static int exploreRight(int idx) {
        int cnt = 0;
        double dm = -Double.MAX_VALUE;
        for (int i = idx + 1; i <= N; i++) {
            double d = slope(idx, map[idx], i, map[i], 1);
            if (d > dm) {
                dm = d;
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) map[i] = Integer.parseInt(st.nextToken());

        int maxVal = 0;
        for (int i = 1; i <= N; i++) {
            int l = exploreLeft(i), r = exploreRight(i);
            maxVal = Math.max(l + r, maxVal);
        }

        System.out.println(maxVal);
    }
}
