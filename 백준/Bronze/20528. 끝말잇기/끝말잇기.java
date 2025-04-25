import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean res = true;
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        char ch = st.nextToken().charAt(0);

        for (int i = 1; i < N; i++) {
            if (st.nextToken().charAt(0) != ch) {
                res = false;
                break;
            }
        }

        System.out.println(res ? 1 : 0);
    }
}