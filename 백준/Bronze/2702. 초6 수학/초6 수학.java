import java.io.*;
import java.util.*;

public class Main {
    public static int Euclidean(int a, int b) {
        while(b > 0) {
            int store_b = b;
            b = a % b;
            a = store_b;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            int gcd = Euclidean(a, b);
            int lcm = a * b / gcd;
            System.out.println(lcm + " " + gcd);
        }
        br.close();
    }
}