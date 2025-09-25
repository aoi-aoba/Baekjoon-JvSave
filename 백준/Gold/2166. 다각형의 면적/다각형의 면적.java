import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static List<int[]> points = new ArrayList<>();
    public static double shoelace() {
        long left = 0, right = 0;
        for (int i = 0; i < N; i++) {
            left += (long) points.get(i)[0] * points.get((i != N - 1) ? i + 1 : 0)[1];
            right += (long) points.get(i)[1] * points.get((i != N - 1) ? i + 1 : 0)[0];
        }
        return Math.abs((left - right) / 2.0);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            points.add(new int[]{a, b});
        }
        System.out.printf("%.1f", shoelace());
    }
}