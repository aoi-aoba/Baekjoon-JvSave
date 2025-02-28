import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());

        int c1 = a2 * 2 + a3 * 4;
        int c2 = a1 * 2 + a3 * 2;
        int c3 = a1 * 4 + a2 * 2;

        System.out.println(Math.min(c1, Math.min(c2, c3)));
        br.close();
    }
}