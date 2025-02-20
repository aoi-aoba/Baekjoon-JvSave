import java.io.*;
import java.util.*;

public class Main {
    public static int prime(int n) {
        if(n == 1) return -1;
        else {
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) return i;
            }
            return -1;
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 1) return;
        while(true) {
            if(prime(N) == -1) {
                System.out.println(N);
                break;
            } else {
                int temp = prime(N);
                System.out.println(temp);
                N /= temp;
            }
        }
        br.close();
    }
}