import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            long s = Long.parseLong(br.readLine());
            boolean isPrime = true;
            for(long j=2; j<1000001; j++)
                if(s % j == 0) isPrime = false;
            if(isPrime) System.out.println("YES");
            else System.out.println("NO");
        }
        br.close();
    }
}