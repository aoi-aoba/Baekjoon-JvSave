import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int index = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            if(str.equals("E")) break;
            if(index != 1) sb.append("\n");
            int b = Integer.parseInt(st.nextToken());
            boolean result = false;

            result = switch (str) {
                case ">" -> a > b;
                case ">=" -> a >= b;
                case "<" -> a < b;
                case "<=" -> a <= b;
                case "==" -> a == b;
                case "!=" -> a != b;
                default -> false;
            };
            sb.append("Case ").append(index).append(": ").append(result);
            index++;
        }

        System.out.print(sb);
        br.close();
    }
}