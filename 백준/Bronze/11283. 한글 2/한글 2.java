import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int unicode = str.charAt(0);
        System.out.println(unicode-44031);
        sc.close();
    }
}