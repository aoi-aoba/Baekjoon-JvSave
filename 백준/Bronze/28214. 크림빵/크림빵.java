import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()),
                p = Integer.parseInt(st.nextToken()), res = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < k; j++)
                if (Integer.parseInt(st.nextToken()) == 0) cnt++;
            if (cnt < p) res++;
        }
        System.out.println(res);
        br.close();
    }
}