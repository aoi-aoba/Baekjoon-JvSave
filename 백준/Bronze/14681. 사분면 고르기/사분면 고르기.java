import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pos_x = sc.nextInt();
        int pos_y = sc.nextInt();

        if(pos_x > 0) {
            if(pos_y > 0) System.out.println(1);
            else System.out.println(4);
        } else {
            if(pos_y > 0) System.out.println(2);
            else System.out.println(3);
        }
    }
}