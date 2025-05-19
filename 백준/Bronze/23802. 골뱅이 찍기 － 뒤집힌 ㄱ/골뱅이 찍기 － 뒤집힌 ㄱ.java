import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++)
            sb.append("@".repeat(5 * N)).append("\n");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < N; j++) sb.append("@".repeat(N)).append("\n");
        System.out.println(sb);
    }
}