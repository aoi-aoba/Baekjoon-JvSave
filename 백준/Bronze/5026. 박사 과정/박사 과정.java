import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- != 0) {
            String str = br.readLine();
            if(!str.contains("=")) {
                StringTokenizer st = new StringTokenizer(str, "+");
                int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
                sb.append(a + b).append("\n");
            } else sb.append("skipped\n");
        }
        System.out.print(sb);
        br.close();
    }
}