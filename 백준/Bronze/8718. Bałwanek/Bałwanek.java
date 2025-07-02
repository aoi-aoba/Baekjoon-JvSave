import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken());
        n *= 1000;
        if (7000 * a <= n) System.out.println(7000*a);
        else if (3500 * a <= n) System.out.println(3500*a);
        else if (1750 * a <= n) System.out.println(1750*a);
        else System.out.println(0);
        br.close();
    }
}
