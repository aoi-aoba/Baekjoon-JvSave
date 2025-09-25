import java.io.*;
import java.util.*;

public class Main {
    public static long[] x = new long[5];
    public static long[] y = new long[5];

    public static boolean onSegment(int a, int b, int c) {
        return Math.min(x[a], x[b]) <= x[c] && x[c] <= Math.max(x[a], x[b])
                && Math.min(y[a], y[b]) <= y[c] && y[c] <= Math.max(y[a], y[b]);
    }

    public static long crossProd(int a, int b, int c) {
        return (x[b] - x[a]) * (y[c] - y[a]) - (y[b] - y[a]) * (x[c] - x[a]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[2 * i - 1] = Long.parseLong(st.nextToken());
            y[2 * i - 1] = Long.parseLong(st.nextToken());
            x[2 * i] = Long.parseLong(st.nextToken());
            y[2 * i] = Long.parseLong(st.nextToken());
        }

        long d1 = crossProd(1, 2, 3);
        long d2 = crossProd(1, 2, 4);
        long d3 = crossProd(3, 4, 1);
        long d4 = crossProd(3, 4, 2);

        boolean intersect = (d1 > 0 && d2 < 0 || d1 < 0 && d2 > 0)
                && (d3 > 0 && d4 < 0 || d3 < 0 && d4 > 0);

        if (d1 == 0 && onSegment(1, 2, 3)) intersect = true;
        if (d2 == 0 && onSegment(1, 2, 4)) intersect = true;
        if (d3 == 0 && onSegment(3, 4, 1)) intersect = true;
        if (d4 == 0 && onSegment(3, 4, 2)) intersect = true;

        System.out.println(intersect ? 1 : 0);
    }
}
