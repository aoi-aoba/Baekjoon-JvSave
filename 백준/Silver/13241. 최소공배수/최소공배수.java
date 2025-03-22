import java.util.*;
import java.io.*;

public class Main {
    public static long Euclidean(long a, long b) {
        while(b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        long gcd = Euclidean(a, b);
        System.out.println(a * b / gcd);
    }
}