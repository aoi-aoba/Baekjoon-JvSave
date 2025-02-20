import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();

        double n=(double)(b-a)/400;

        System.out.printf("%.6f",1/(1+Math.pow(10,n)));
    }
}