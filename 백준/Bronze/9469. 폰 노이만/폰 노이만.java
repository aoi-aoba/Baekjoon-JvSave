import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            double D = Double.parseDouble(st.nextToken()), A = Double.parseDouble(st.nextToken()),
                    B = Double.parseDouble(st.nextToken()), F = Double.parseDouble(st.nextToken());
            System.out.println(N + " " + D / (A + B) * F);
        }
        br.close();
    }
}