import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int snack_price = sc.nextInt();
        int snack_val = sc.nextInt();
        int money_have = sc.nextInt();
        if(snack_val * snack_price <= money_have) System.out.println(0);
        else System.out.println(snack_price * snack_val - money_have);
    }
}