import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true) {
            BigInteger N = sc.nextBigInteger();
            if(N.equals(BigInteger.ZERO)) break;
            if(N.remainder(BigInteger.valueOf(42)).equals(BigInteger.ZERO))
                System.out.println("PREMIADO");
            else System.out.println("TENTE NOVAMENTE");
        }
    }
}