import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int first_apple = sc.nextInt();
        int first_orange = sc.nextInt();
        int second_apple = sc.nextInt();
        int second_orange = sc.nextInt();
        int faso = first_apple + second_orange;
        int fosa = first_orange + second_apple;
        System.out.println(Math.min(faso, fosa));
    }
}