import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            double temp = sc.nextDouble();
            if(temp - 0.0 < 0.00000001) break;
            double res = 1+temp+temp*temp+temp*temp*temp+temp*temp*temp*temp;
            System.out.printf("%.2f\n", res);
        }
    }
}