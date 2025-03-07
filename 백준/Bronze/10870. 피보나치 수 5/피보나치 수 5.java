import java.io.*;
import java.util.*;

public class Main {
    public static int fib_fast(int n) {
        if(n == 0) return 0;
        else if(n == 1 || n == 2) return 1;

        int[] fib = new int[n+1];
        fib[0] = 0; fib[1] = 1; fib[2] = 1;

        for(int i = 3; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        return fib[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fib_fast(n));
        br.close();
    }
}