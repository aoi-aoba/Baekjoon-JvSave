import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[][][] arr_w = new int[21][21][21];
    public static int dp(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return 1;
        if (a > 20 || b > 20 || c > 20) return dp(20, 20, 20);
        if (arr_w[a][b][c] > 0) return arr_w[a][b][c];
        if (a < b && b < c) {
            arr_w[a][b][c] = dp(a, b, c-1) + dp(a, b-1, c-1) - dp(a, b-1, c);
            return arr_w[a][b][c];
        }
        arr_w[a][b][c] = dp(a-1, b, c) + dp(a-1, b-1, c) + dp(a-1, b, c-1) - dp(a-1, b-1, c-1);
        return arr_w[a][b][c];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
            if (a == b && b == c && c == -1) break;
            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(dp(a, b, c));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}