import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long newScore = Long.parseLong(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int res = 1, sameScore = 0;

        ArrayList<Long> list = new ArrayList<>();
        if(N == 0) {
            System.out.println(1);
            return;
        }
        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            long temp = Long.parseLong(st.nextToken());
            if(temp > newScore) {
                if(sameScore == 0) res++;
                else {
                    res += sameScore + 1;
                    sameScore = 0;
                }
            }
            else if(temp == newScore) sameScore++;
        }

        if(res + sameScore > P) System.out.println(-1);
        else System.out.println(res);
    }
}