import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int dayVac = sc.nextInt();
        int mathVal = sc.nextInt();
        int korVal = sc.nextInt();
        int maxMathDay = sc.nextInt();
        int maxKorDay = sc.nextInt();

        int mathDay = (mathVal % maxMathDay == 0) ? mathVal/maxMathDay : mathVal/maxMathDay+1;
        int korDay = (korVal % maxKorDay == 0) ? korVal/maxKorDay : korVal/maxKorDay+1;
        System.out.println(dayVac - Math.max(mathDay, korDay));
    }
}