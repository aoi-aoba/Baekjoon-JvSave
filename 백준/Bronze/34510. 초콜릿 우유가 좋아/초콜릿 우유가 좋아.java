import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h1 = Integer.parseInt(st.nextToken()), h2 = Integer.parseInt(st.nextToken()),
                h3 = Integer.parseInt(st.nextToken());
        int s = h1 + h2 + h3, p = h3 + h2 + h3;

        long N = Long.parseLong(br.readLine());
        long res = (N % 2 == 0) ? p * (N / 2L) : p * (N / 2L) + s;
        System.out.println(res);
    }
}
