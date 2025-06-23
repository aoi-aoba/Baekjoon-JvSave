import java.io.*;
import java.util.*;

public class Main {
    public static int extendedGCD(int a, int b, int[] xy) {
        if (b == 0) {
            xy[0] = 1;
            xy[1] = 0;
            return a;
        }
        int[] temp = new int[2];
        int gcd = extendedGCD(b, a % b, temp);
        xy[0] = temp[1];
        xy[1] = temp[0] - (a / b) * temp[1];
        return gcd;
    }

    public static int solve(int M, int N, int x, int y) {
        int a = M, b = N, c = y - x;
        int[] xy = new int[2];
        int gcd = extendedGCD(a, b, xy);
        if (c % gcd != 0) return -1;
        int t = (int)(((long)xy[0] * (c / gcd)) % (N / gcd));
        if (t < 0) t += N / gcd;
        int year = x + M * t;
        int lcm = M / gcd * N;
        return year > lcm ? -1 : year;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            sb.append(solve(M, N, x, y)).append('\n');
        }
        System.out.print(sb);
    }
}