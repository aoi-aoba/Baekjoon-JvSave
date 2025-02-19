import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = 0, B = 0;
        A += sc.nextInt();
        B += sc.nextInt()+sc.nextInt();
        A += sc.nextInt();
        System.out.println(Math.abs(A-B));
    }
}