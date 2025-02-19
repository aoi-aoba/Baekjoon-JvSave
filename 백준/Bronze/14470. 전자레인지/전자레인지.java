import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int meatOriTemp = sc.nextInt();
        int meatForTemp = sc.nextInt();
        int frozenMeatHeatTime = sc.nextInt();
        int frozenMeatThawTime = sc.nextInt();
        int normalMeatHeatTime = sc.nextInt();
        int time = 0;

        if(meatOriTemp < 0) {
            time += frozenMeatHeatTime * (-1 * meatOriTemp);
            time += frozenMeatThawTime;
            time += normalMeatHeatTime * meatForTemp;
        } else if(meatOriTemp == 0) {
            time += frozenMeatThawTime;
            time += normalMeatHeatTime * meatForTemp;
        } else {
            time += normalMeatHeatTime * (meatForTemp - meatOriTemp);
        }

        System.out.println(time);
        sc.close();
    }
}