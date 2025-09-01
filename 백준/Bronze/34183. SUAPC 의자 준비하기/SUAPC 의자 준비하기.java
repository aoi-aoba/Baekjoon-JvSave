import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
        System.out.println((3 * N <= M) ? 0 : B + (A) * (3*N-M));
    }
}