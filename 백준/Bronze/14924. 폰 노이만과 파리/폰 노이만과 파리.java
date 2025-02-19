import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int T = sc.nextInt();
        int D = sc.nextInt();
        int time = D/(S*2);
        int F = time*T;
        System.out.println(F);
        sc.close();
    }
}