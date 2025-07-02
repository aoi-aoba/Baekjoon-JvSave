import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken()), a = Long.parseLong(st.nextToken()),
                    b = Long.parseLong(st.nextToken()), gold = 1L;
            for (int i = 0; i < n; i++) gold *= 2;
            if (a % 2 == 1L) {
                sb.append(n).append("\n");
            } else {
                long target = Math.min(a, b), cut = 0;
                while (target != 0L) {
                    if (gold > target) {
                        gold /= 2;
                        cut++;
                    } else target -= gold;
                }
                sb.append(cut).append("\n");
            }
        }

        System.out.print(sb);
    }
}