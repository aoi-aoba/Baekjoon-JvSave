import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = sc.nextBigInteger();
        System.out.println(N.multiply(N).multiply(N));
        System.out.println(3);
    }
}