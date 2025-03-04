import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
           br.readLine();
           int a = Integer.parseInt(br.readLine());
           BigInteger sum = BigInteger.ZERO;

           for(int j=0; j<a; j++)
               sum = sum.add(new BigInteger(br.readLine()));

           String remainder = String.valueOf(sum.remainder(BigInteger.valueOf(a)));
           if(remainder.equals("0")) System.out.println("YES");
           else System.out.println("NO");
        }

        br.close();
    }
}