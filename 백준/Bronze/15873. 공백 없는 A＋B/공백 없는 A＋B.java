import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int AB = sc.nextInt();
        if(AB < 100) System.out.println(AB/10 + AB%10);
        else if(AB < 1000) {
            if(AB / 10 % 10 == 0) System.out.println(AB/10 + AB%10);
            else System.out.println(AB/100+10);
        } else System.out.println(10+10);
    }
}