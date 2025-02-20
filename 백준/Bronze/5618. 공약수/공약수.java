import java.util.*;

public class Main {
    public static int GCD(int a, int b) {
        if(b == 0) return a;
        else return GCD(b, a%b);
    }
    public static void CF(int n) {
        for(int i=1; i<=n; i++) {
            if(n % i == 0) System.out.println(i);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        if(n == 2) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            res = GCD(a, b);
        } else {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            res = GCD(a, b);
            res = GCD(res, c);
        }
        CF(res);
        sc.close();
    }
}