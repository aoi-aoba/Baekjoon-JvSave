import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        System.out.println(Math.min(M,K) + N - Math.max(M,K));
    }
}