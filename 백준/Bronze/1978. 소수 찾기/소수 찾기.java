import java.io.*;
import java.util.*;

public class Main {
    public static boolean prime(int n) {
        if(n == 1) return false;
        else {
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) return false;
            }
            return true;
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int primeNum = 0;
        for(int i = 1; i <= N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(prime(temp)) primeNum++;
        }
        System.out.println(primeNum);
    }
}