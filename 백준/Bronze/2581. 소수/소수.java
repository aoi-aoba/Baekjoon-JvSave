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
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int primeMin = 10000, primeSum = 0;
        for(int i=M; i<=N; i++) {
            if(prime(i)) {
                if(i < primeMin) primeMin = i;
                primeSum += i;
            }
        }
        if(primeSum == 0) System.out.println(-1);
        else {
            System.out.println(primeSum);
            System.out.println(primeMin);
        }
        br.close();
    }
}