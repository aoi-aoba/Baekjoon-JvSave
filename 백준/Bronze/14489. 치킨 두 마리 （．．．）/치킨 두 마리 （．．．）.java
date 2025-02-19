import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long leftMoney = A + B;
        long C = sc.nextInt();
        if(leftMoney >= 2*C) System.out.println(leftMoney-(2*C));
        else System.out.println(leftMoney);

    }
}