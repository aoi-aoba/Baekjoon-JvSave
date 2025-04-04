import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), R = 0;
        int[] M = new int[K];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<K; i++) M[i] = Integer.parseInt(st.nextToken());

        for(int i = 0; i < K; i++) {
            if(M[i] % 2 == 1) R += M[i] / 2 + 1;
            else R += M[i] /2;
        }
        if(N > R) System.out.println("NO");
        else System.out.println("YES");
        br.close();
    }
}