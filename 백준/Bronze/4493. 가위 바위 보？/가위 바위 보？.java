import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int p1 = 0, p2 = 0;
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char p1c = st.nextToken().charAt(0), p2c = st.nextToken().charAt(0);
                if(p1c == 'R') {
                    if(p2c == 'P') p2++;
                    if(p2c == 'S') p1++;
                } else if(p1c == 'P') {
                    if(p2c == 'R') p1++;
                    if(p2c == 'S') p2++;
                } else {
                    if(p2c == 'R') p2++;
                    if(p2c == 'P') p1++;
                }
            }
            if(p1 > p2) System.out.println("Player 1");
            else if(p2 > p1) System.out.println("Player 2");
            else System.out.println("TIE");
        }
        System.out.println(sb);
        br.close();
    }
}
