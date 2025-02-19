import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();
        double first = A * B / (double)C;
        double second = A / (double)B * C;
        System.out.println((int)Math.max(first, second));
    }
}