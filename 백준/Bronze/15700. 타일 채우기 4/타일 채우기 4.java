import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        if(n * m % 2 == 0)
            System.out.println(n*m/2);
        else System.out.println((n*m-1)/2);
        sc.close();
    }
}