import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        long res = 1;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            long temp = Long.parseLong(st.nextToken());
            res *= temp;
            res %= M;
        }
        System.out.println(res);
    }
}