import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int t = 0;
        if(L % 5 > 0) t = L / 5 + 1;
        else t = L / 5;
        System.out.println(t);
    }
}