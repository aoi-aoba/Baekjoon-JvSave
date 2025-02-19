import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carCantRide = sc.nextInt();
        int violateCars = 0;
        for(int i=0; i<5; i++)
            if(carCantRide == sc.nextInt()) violateCars++;
        System.out.println(violateCars);
    }
}