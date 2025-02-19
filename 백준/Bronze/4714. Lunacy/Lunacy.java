import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            double temp = sc.nextDouble();
            if(temp < 0) break;
            System.out.print("Objects weighing ");
            System.out.printf("%.2f", temp);
            System.out.print(" on Earth will weigh ");
            System.out.printf("%.2f", temp*0.167);
            System.out.println(" on the moon.");
        }
    }
}