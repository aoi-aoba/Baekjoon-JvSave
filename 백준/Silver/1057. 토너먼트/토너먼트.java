import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken()), cnt = 0;
        while (K != L) {
            K = (K % 2 == 0) ? K / 2 : K / 2 + 1;
            L = (L % 2 == 0) ? L / 2 : L / 2 + 1;
            cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}