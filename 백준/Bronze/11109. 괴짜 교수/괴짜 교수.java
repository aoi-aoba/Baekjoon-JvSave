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
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()),
                    s = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
            int just = n * s, para = d + n * p;
            sb.append(just < para ? "do not parallelize" : just > para ? "parallelize" : "does not matter").append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}