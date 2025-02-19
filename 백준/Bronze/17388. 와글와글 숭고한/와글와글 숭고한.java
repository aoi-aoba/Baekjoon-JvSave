import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int soongsil = sc.nextInt();
        int korea = sc.nextInt();
        int hanyang = sc.nextInt();
        if(soongsil + korea + hanyang >= 100) System.out.println("OK");
        else {
            if(soongsil < korea && soongsil < hanyang) System.out.println("Soongsil");
            else if(korea < soongsil && korea < hanyang) System.out.println("Korea");
            else System.out.println("Hanyang");
        }
        sc.close();
    }
}