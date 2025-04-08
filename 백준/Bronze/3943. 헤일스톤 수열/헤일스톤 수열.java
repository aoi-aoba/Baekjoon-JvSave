import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine()), caseMax = N;
            while (N != 1) {
                if (N % 2 == 0) N /= 2;
                else N = N * 3 + 1;
                caseMax = Math.max(caseMax, N);
            }
            sb.append(caseMax);
            if (i != T - 1) sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}