import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(m == 0 && n == 0) return;
            else if(m % n == 0) System.out.println("factor");
            else if(n % m == 0) System.out.println("multiple");
            else System.out.println("neither");
        }
    }
}