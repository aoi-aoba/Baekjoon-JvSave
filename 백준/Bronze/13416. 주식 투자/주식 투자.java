import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine()), res = 0;
            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int max = 0;
                for (int i = 0; i < 3; i++) {
                    int temp = Integer.parseInt(st.nextToken());
                    max = Math.max(temp, max);
                }
                res += max;
            }
            sb.append(res).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}