import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            int size = Integer.parseInt(br.readLine());
            for (int j = 1; j <= size; j++) {
                for (int k = 1; k <= size; k++) {
                    if (j == 1 || j == size) sb.append("#");
                    else if (k == 1 || k == size) sb.append("#");
                    else sb.append("J");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}