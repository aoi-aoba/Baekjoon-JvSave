import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N * 5; i++) {
            if (i <= N * 5 - N) sb.append("@".repeat(N)).append("\n");
            else sb.append("@".repeat(N * 5)).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}