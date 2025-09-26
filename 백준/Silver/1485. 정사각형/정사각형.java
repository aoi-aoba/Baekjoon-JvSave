import java.io.*;
import java.util.*;

public class Main {
    public static int[][] points = new int[4][2];
    public static long distSquare(int[] p1, int[] p2) {
        int dx = p1[0] - p2[0], dy = p1[1] - p2[1];
        return (long) dx * dx + (long) dy * dy;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            for (int i = 0; i < 4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
                points[i][0] = x;
                points[i][1] = y;
            }
            HashSet<Long> set = new HashSet<>();
            set.add(distSquare(points[0], points[1]));
            set.add(distSquare(points[0], points[2]));
            set.add(distSquare(points[0], points[3]));
            set.add(distSquare(points[1], points[2]));
            set.add(distSquare(points[1], points[3]));
            set.add(distSquare(points[2], points[3]));
            if (set.size() != 2) System.out.println(0);
            else System.out.println(1);
        }
    }
}