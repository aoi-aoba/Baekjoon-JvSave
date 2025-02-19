import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int phy = sc.nextInt();
        int che = sc.nextInt();
        int ani = sc.nextInt();
        int ear = sc.nextInt();
        int his = sc.nextInt();
        int geo = sc.nextInt();
        int min_sci = Math.min(Math.min(phy, che), Math.min(ani, ear));
        int max_soc = Math.max(his, geo);
        System.out.println(phy+che+ani+ear-min_sci+max_soc);
    }
}