import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.next();
        int b = sc.nextInt();
        sc.next();
        int c = sc.nextInt();
        if(c == a+b) System.out.println("YES");
        else System.out.println("NO");
    }
}