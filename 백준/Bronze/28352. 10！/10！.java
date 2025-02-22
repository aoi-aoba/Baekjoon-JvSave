import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long n10 = 3628800, fact = 1;
        for(int i=1; i<=n; i++)
            fact *= (long)i;
        System.out.println(fact / n10 * 6);
        br.close();
    }
}