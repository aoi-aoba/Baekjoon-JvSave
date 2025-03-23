import java.util.*;
import java.io.*;

public class Main {
    public static Boolean isPrime(long num) {
        if(num < 2) return false;
        for(long i = 2; i <= Math.sqrt(num) + 1; i++) {
            if(num % i == 0) return false;
        } return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        for(int i=0; i<N; i++) {
            long num = Long.parseLong(br.readLine());
            if(num == 0 || num == 1 || num == 2) System.out.println(2);
            else while(true) {
                if(isPrime(num)) {
                    System.out.println(num);
                    break;
                }
                num++;
            }
        }
        br.close();
    }
}