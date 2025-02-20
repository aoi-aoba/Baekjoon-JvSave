import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a == 0 && b == 0 && c == 0) break;
            if((2 * b) == (a + c))
                System.out.println("AP " + (2*c-b));
            else System.out.println("GP " + c*(c/b));
        }
    }
}