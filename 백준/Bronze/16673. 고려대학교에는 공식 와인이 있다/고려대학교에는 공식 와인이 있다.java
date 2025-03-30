import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), P = Integer.parseInt(st.nextToken()), cnt = 0;
        for (int i = 1; i <= C; i++) cnt += K * i + P * i * i;
        System.out.println(cnt);
    }
}