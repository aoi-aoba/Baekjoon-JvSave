import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), i = 0, diff = 1000000;
            if (b == n && n == 0) break;
            while (true) {
                if (Math.abs(b - Math.pow(i + 1, n)) < diff) {
                    diff = (int) Math.abs(b - Math.pow(i + 1, n));
                    i++;
                }
                else break;
            }
            sb.append(i).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}