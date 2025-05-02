import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        sb.append("int a;\n");
        for (int i = 1; i <= N; i++) {
            sb.append("int ").append("*".repeat(i)).append("ptr").append(i != 1 ? i : "");
            if (i == 1) sb.append(" = &a;\n");
            else sb.append(" = &ptr").append(i != 2 ? i - 1 : "").append(";\n");
        }
        System.out.print(sb);
        br.close();
    }
}