import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sol = 0;
        for(int i = 0; i < 3; i++) {
            sol += Math.min(n, sc.nextInt());
        }
        System.out.println(sol);
    }
}