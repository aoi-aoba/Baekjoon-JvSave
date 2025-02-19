import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = sc.nextInt();
        int p = (num < m) ? 0 : num/m;
        int q = Math.max(num%m, 0);
        System.out.println(p + " " + q);
    }
}