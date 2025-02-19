import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a_x = sc.nextInt(), a_y = sc.nextInt(), a_z = sc.nextInt();
        int c_x = sc.nextInt(), c_y = sc.nextInt(), c_z = sc.nextInt();
        int b_x = c_x - a_z;
        int b_y = c_y / a_y;
        int b_z = c_z - a_x;
        System.out.println(b_x + " " + b_y + " " + b_z);
    }
}