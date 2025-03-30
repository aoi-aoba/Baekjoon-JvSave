import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] team1 = new int[9];
        int[] team2 = new int[9];
        for (int i = 0; i < team1.length; i++) {
            team1[i] = scanner.nextInt();
        }
        for (int i = 0; i < team2.length; i++) {
            team2[i] = scanner.nextInt();
        }
        int team1Sum = 0;
        int team2Sum = 0;
        boolean leadChanged = false;
        for (int i = 0; i < 9; i++) {
            team1Sum += team1[i];
            if (team1Sum > team2Sum) {
                leadChanged = true;
            }
            team2Sum += team2[i];
        }
        if (leadChanged && team1Sum < team2Sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}