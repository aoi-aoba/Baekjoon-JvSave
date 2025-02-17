import java.util.*;
import java.io.*;

public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            long N = Integer.parseInt(st.nextToken());
            long M = Integer.parseInt(st.nextToken());
            long k = Integer.parseInt(st.nextToken());
            long D = Integer.parseInt(st.nextToken());

            long numerator = 2 * D;
            long denominator = N*(M*(M-1)*k+(N-1)*M*M);
            double B = numerator / denominator;

            if(B < 1) System.out.println(-1);
            else {
                long A = k * (long)B;
                long inGame = N*((M*(M-1))/2)*A;
                long outGame = (long)(M*M*(double)(N*(N-1)/2)*B);
                long totalGame = inGame + outGame;
                System.out.println(totalGame);
            }
        }
    }
}