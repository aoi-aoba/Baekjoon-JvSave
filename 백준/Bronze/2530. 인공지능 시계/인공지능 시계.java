import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
        int timeCook = sc.nextInt();
        s += timeCook;
        while(s >= 60) {
            s -= 60;
            m += 1;
        } while(m >= 60) {
            m -= 60;
            h += 1;
        } while(h >= 24) {
            h -= 24;
        }
        System.out.println(h + " " + m + " " + s);
    }
}