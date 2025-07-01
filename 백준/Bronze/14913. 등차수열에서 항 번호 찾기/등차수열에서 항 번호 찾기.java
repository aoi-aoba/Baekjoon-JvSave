import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        double n = (double) (k - a) / d + 1;
        if ((int) n == n && n > 0) System.out.println((int) n);
        else System.out.println("X");
        br.close();
    }
}