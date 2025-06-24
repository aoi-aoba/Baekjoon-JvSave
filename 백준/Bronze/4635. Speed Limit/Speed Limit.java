import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == -1) break;
            int tLast = 0, ret = 0;
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
                ret += (t - tLast) * s;
                tLast = t;
            }
            sb.append(ret).append(" miles\n");
        }
        System.out.print(sb);
    }
}