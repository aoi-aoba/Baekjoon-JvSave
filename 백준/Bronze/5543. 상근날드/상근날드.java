import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int burger_s = sc.nextInt(), burger_j = sc.nextInt(), burger_h = sc.nextInt();
        int coke = sc.nextInt(), cider = sc.nextInt();
        int min_burger = Math.min(burger_h, Math.min(burger_j, burger_s));
        int min_drink = Math.min(coke, cider);
        System.out.println(min_drink + min_burger - 50);
    }
}
