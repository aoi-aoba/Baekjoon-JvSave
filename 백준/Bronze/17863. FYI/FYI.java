import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N >= 5550000 && N <= 5559999) System.out.println("YES");
        else System.out.println("NO");
    }
}