import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            double d = sc.nextDouble();
            double f = sc.nextDouble();
            double p = sc.nextDouble();
            sb.append(String.format("$%.2f\n", d*f*p));
        }
        System.out.print(sb);
    }
}