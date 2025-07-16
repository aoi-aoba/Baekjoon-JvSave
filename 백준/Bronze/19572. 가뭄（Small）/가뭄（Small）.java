import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d1 = Integer.parseInt(st.nextToken()), d2 = Integer.parseInt(st.nextToken()),
                d3 = Integer.parseInt(st.nextToken());
        double a = ((d1 + d2) - d3) / 2.0;
        double b = (double) d1 - a;
        double c = (double) d3 - b;
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("1");
            System.out.printf("%.1f %.1f %.1f", a, b, c);
        } else System.out.println("-1");
    }
}