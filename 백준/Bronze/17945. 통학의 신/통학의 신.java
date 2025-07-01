import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
        double D = Math.sqrt(A * A - B);
        if (D == 0) System.out.println((-1) * A);
        else System.out.println((-1 * A - (int) D) + " " + (-1 * A + (int) D));
        br.close();
    }
}