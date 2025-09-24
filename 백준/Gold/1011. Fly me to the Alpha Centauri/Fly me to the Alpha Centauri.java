import java.io.*;
import java.util.*;

public class Main {
    public static int calc (int dist) {
        int i = (int) Math.sqrt(dist);
        if (i * i == dist) return 2 * i - 1;
        else if (i * i < dist && dist <= i * i + i) return 2 * i;
        else return 2 * i + 1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(calc(end - start)).append("\n");
        }
        System.out.print(sb);
    }
}