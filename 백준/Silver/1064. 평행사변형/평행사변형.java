import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static double dist(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int xa = Integer.parseInt(st.nextToken()), ya = Integer.parseInt(st.nextToken());
        int xb = Integer.parseInt(st.nextToken()), yb = Integer.parseInt(st.nextToken());
        int xc = Integer.parseInt(st.nextToken()), yc = Integer.parseInt(st.nextToken());

        double res = 0;
        if ((xb-xa)*(yc-ya)-(yb-ya)*(xc-xa) == 0) res = -1.0;
        else {
            double[] dists = new double[3];
            dists[0] = 2 * (dist(xa, ya, xb, yb) + dist(xa, ya, xc, yc));
            dists[1] = 2 * (dist(xb, yb, xa, ya) + dist(xb, yb, xc, yc));
            dists[2] = 2 * (dist(xc, yc, xa, ya) + dist(xc, yc, xb, yb));
            Arrays.sort(dists);
            res = dists[2] - dists[0];
        }

        System.out.println(res);
    }
}