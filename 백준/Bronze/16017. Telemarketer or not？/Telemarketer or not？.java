import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean isTeleMarketer = false;
        int first = sc.nextInt();
        if(first == 8 || first == 9) isTeleMarketer = true;
        int second = sc.nextInt(), third = sc.nextInt();
        if(second != third) isTeleMarketer = false;
        int fourth = sc.nextInt();
        if(isTeleMarketer) if(fourth != 8 && fourth != 9) isTeleMarketer = false;
        System.out.println(isTeleMarketer ? "ignore" : "answer");
    }
}