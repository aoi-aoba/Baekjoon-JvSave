import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int ansA = 0, ansB = 0;

        for (int a = 1; a <= 9; a++) {
            System.out.println("? A " + a);
            int resp = sc.nextInt();
            if (resp == 1) {
                ansA = a;
                break;
            }
        }

        for (int b = 1; b <= 9; b++) {
            System.out.println("? B " + b);
            int resp = sc.nextInt();
            if (resp == 1) {
                ansB = b;
                break;
            }
        }

        System.out.println("! " + (ansA + ansB));
    }
}