import java.io.*;
import java.util.*;

public class Main {
    public static long[] x = new long[5];
    public static long[] y = new long[5];

    public static long[] dot3dCrossProd(long x1, long y1, long w1, long x2, long y2, long w2) {
        return new long[]{y1 * w2 - w1 * y2, w1 * x2 - x1 * w2, x1 * y2 - x2 * y1};
    }

    public static double[] calcNode() {
        long[] p1p2 = dot3dCrossProd(x[1], y[1], 1, x[2], y[2], 1);
        long[] p3p4 = dot3dCrossProd(x[3], y[3], 1, x[4], y[4], 1);
        long[] v = dot3dCrossProd(p1p2[0], p1p2[1], p1p2[2], p3p4[0], p3p4[1], p3p4[2]);

        if (v[0] == 0 && v[1] == 0 && v[2] == 0) {
            long p1x = x[1], p1y = y[1], p2x = x[2], p2y = y[2];
            if (p1x > p2x || (p1x == p2x && p1y > p2y)) {
                long tempx = p1x; long tempy = p1y;
                p1x = p2x; p1y = p2y;
                p2x = tempx; p2y = tempy;
            }
            long p3x = x[3], p3y = y[3], p4x = x[4], p4y = y[4];
            if (p3x > p4x || (p3x == p4x && p3y > p4y)) {
                long tempx = p3x; long tempy = p3y;
                p3x = p4x; p3y = p4y;
                p4x = tempx; p4y = tempy;
            }
            long overlapStartX, overlapStartY, overlapEndX, overlapEndY;
            if (p1x > p3x || (p1x == p3x && p1y > p3y)) {
                overlapStartX = p1x;
                overlapStartY = p1y;
            } else {
                overlapStartX = p3x;
                overlapStartY = p3y;
            }
            if (p2x < p4x || (p2x == p4x && p2y < p4y)) {
                overlapEndX = p2x;
                overlapEndY = p2y;
            } else {
                overlapEndX = p4x;
                overlapEndY = p4y;
            }
            if (overlapStartX == overlapEndX && overlapStartY == overlapEndY)
                return new double[]{overlapStartX, overlapStartY};
            else return null;
        }

        return new double[]{(double) v[0] / v[2], (double) v[1] / v[2]};
    }

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
        if (intersect) {
            double[] node = calcNode();
            if (node != null) System.out.print(node[0] + " " + node[1]);
        }
    }
}