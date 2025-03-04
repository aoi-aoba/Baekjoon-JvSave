import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());
        long d = Integer.parseInt(st.nextToken());
        long e = Integer.parseInt(st.nextToken());
        long f = Integer.parseInt(st.nextToken());
        long x = a * d;
        long y = b * e;
        long z = c * f;
        long mx = Math.max(x, Math.max(y, z));
        if (x == mx) System.out.print("Joffrey ");
        if (y == mx) System.out.print("Robb ");
        if (z == mx) System.out.print("Stannis");
        br.close();
    }
}