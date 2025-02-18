import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N==0) {
            System.out.println(1);
            return;
        }
        System.out.println(fact(1, N));
    }
    public static BigInteger fact(int start, int end) {
        if(start == end) return BigInteger.valueOf(end);
        return fact(start, (start+end)/2).multiply((fact((start+end)/2+1, end)));
    }
}