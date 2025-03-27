import java.util.*;
import java.io.*;

public class Main {
    public static int function(int n) {
        int res = 0;
        for(int i = 1; i <= Math.sqrt(n); i++)
            for(int j = i; i * j <= n; j++)
                res++;
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(function(N));
        br.close();
    }
}