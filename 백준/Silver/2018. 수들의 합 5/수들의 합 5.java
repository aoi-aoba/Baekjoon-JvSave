import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int calc(int n) {
        int cnt = 0, p = 1, q = 0;
        while (true) {
            if ((n - q) % p == 0 && (n - q) / p >= 1) cnt++;
            else if ((n - q) / p < 1) break;
            p++;
            q = p * (p-1) / 2;
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        System.out.println(calc(n));
        br.close();
    }
}