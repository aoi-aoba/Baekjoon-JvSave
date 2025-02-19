import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int sub = sc.nextInt();
        if((sum + sub) % 2 != 0) {
            System.out.println(-1);
        } else {
            int A = (sum + sub) / 2;
            int B = (sum - sub) / 2;
            if(A < 0 || B < 0) {
                System.out.println(-1);
            } else System.out.println(Math.max(A, B) + " " + Math.min(A, B));
        }
    }
}