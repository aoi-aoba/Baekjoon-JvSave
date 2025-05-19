import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken()), R = Integer.parseInt(st.nextToken()), A = Integer.parseInt(st.nextToken());

        if (L == R) System.out.println(L + R + (A % 2 == 0 ? A : A-1));
        else if (Math.abs(L - R) <= A) {
            A -= Math.max(L, R) - Math.min(L, R);
            System.out.println(2 * Math.max(L, R) + (A % 2 == 0 ? A : A-1));
        } else {
            if (L < R) System.out.println(2 * Math.min(L + A, R));
            else System.out.println(2 * Math.min(L, R + A));
        }
    }
}