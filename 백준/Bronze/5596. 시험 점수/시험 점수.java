import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mkVal = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        int msVal = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        System.out.println(Math.max(mkVal, msVal));
    }
}