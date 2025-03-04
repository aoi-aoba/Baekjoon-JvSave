import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long m = Integer.parseInt(br.readLine());
        long a = Integer.parseInt(br.readLine());
        long b = Integer.parseInt(br.readLine());
        if (a <= b) System.out.println(b-a);
        else System.out.println(b-a+m);
        br.close();
    }
}