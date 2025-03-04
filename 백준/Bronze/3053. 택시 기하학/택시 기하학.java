import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double euclid = Math.PI * Math.pow(n, 2);
        double taxicap = 2 * Math.pow(n, 2);
        System.out.println(String.format("%.6f", euclid));
        System.out.println(String.format("%.6f", taxicap));
        br.close();
    }
}