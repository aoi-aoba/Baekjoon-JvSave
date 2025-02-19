import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int k = sc.nextInt();
            for(int j=0; j<k; j++) System.out.print("=");
            System.out.println();
        }
        sc.close();
    }
}