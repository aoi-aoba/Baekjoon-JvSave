import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true) {
            int temp = sc.nextInt();
            if(temp == -1) break;
            sum += temp;
        }
        System.out.println(sum);
        sc.close();
    }
}