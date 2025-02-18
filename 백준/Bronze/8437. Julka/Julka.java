import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigInteger T = sc.nextBigInteger();
        BigInteger D = sc.nextBigInteger();
        BigInteger N = (T.subtract(D)).divide(BigInteger.TWO);
        BigInteger K = N.add(D);
        System.out.println(K);
        System.out.println(N);

    }
}