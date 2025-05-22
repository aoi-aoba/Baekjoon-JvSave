import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int gcd(int a, int b) {
        while(b > 0) {
            int store_b = b;
            b = a % b;
            a = store_b;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            int xNow = 0, yNow = 0, lcm = M * N / gcd(M, N);
            while (xNow <= lcm && yNow <= lcm) {
                if (xNow == yNow && xNow == 0) {
                    xNow += x;
                    yNow += y;
                }
                if (xNow < yNow) xNow += M;
                else if (xNow > yNow) yNow += N;
                else break;
            }
            if (xNow == yNow) sb.append(xNow).append("\n");
            else sb.append("-1\n");
        }
        System.out.print(sb);
    }
}