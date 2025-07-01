import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(st.nextToken()), B = new BigInteger(st.nextToken());
        if (A.compareTo(BigInteger.ZERO) < 0 && A.compareTo(BigInteger.ZERO) != 0 && B.compareTo(BigInteger.ZERO) > 0) {
            System.out.println(A.divide(B).subtract(BigInteger.ONE));
            System.out.println(A.subtract(B.multiply(A.divide(B).subtract(BigInteger.ONE))));
        } else if (A.compareTo(BigInteger.ZERO) < 0 && A.compareTo(BigInteger.ZERO) != 0 && B.compareTo(BigInteger.ZERO) < 0) {
            System.out.println(A.divide(B).add(BigInteger.ONE));
            System.out.println(A.subtract(B.multiply(A.divide(B).add(BigInteger.ONE))));
        } else {
            System.out.println(A.divide(B));
            System.out.println(A.remainder(B));
        }
        br.close();
    }
}