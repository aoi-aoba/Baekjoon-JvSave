import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int res = 1;
        if (n != 0) {
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(br.readLine());
                if (a != 0) res *= a;
                res %= m;
            }
        }
        System.out.println(res % m);
    }
}