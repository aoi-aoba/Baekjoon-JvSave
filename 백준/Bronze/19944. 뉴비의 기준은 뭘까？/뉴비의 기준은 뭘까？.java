import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int oldBieStd = sc.nextInt();
        int whichGrade = sc.nextInt();
        if(whichGrade <= 2) System.out.println("NEWBIE!");
        else if(whichGrade <= oldBieStd) System.out.println("OLDBIE!");
        else System.out.println("TLE!");
    }
}