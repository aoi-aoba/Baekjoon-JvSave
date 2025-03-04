import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()), max = 0;
        for(int i=0; i<N; i++) {
            int now = 0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == b && b == c) now = 10000 + a * 1000;
            else if(a == b) now = 1000 + a * 100;
            else if(b == c || c == a) now = 1000 + c * 100;
            else now = 100 * Math.max(a, Math.max(b, c));
            max = Math.max(max, now);
        }
        System.out.println(max);
        br.close();
    }
}