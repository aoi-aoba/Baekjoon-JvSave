import java.util.*;
import java.io.*;

public class Main {
    public static int Euclidean(int a, int b) {
        while(b > 0) {
            int b_store = b;
            b = a % b;
            a = b_store;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A1 = Integer.parseInt(st.nextToken()), B1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int A2 = Integer.parseInt(st.nextToken()), B2 = Integer.parseInt(st.nextToken());

        int A_res = A1 * B2 + B1 * A2;
        int B_res = B1 * B2;
        int gcd = Euclidean(A_res, B_res);
        A_res /= gcd;
        B_res /= gcd;
        System.out.println(A_res + " " + B_res);
    }
}