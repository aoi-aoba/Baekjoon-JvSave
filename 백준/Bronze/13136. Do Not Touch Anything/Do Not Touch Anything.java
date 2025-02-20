import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long R = sc.nextInt();
        long C = sc.nextInt();
        long N = sc.nextInt();
        long needR = (R % N != 0) ? R/N+1 : R/N;
        long needC = (C % N != 0) ? C/N+1 : C/N;
        System.out.println(needR * needC);
    }
}