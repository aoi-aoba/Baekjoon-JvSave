import java.io.*;
import java.util.*;

public class Main {
    private static final double PI = Math.PI;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        double r = Math.sqrt(a / PI);
        System.out.println(2*r*PI);
        br.close();
    }
}