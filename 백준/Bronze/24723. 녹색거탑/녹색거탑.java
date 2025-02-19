import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), res = 1;
        for(int i=0; i<n; i++) {
            res *= 2;
        }
        System.out.println(res);
    }
}