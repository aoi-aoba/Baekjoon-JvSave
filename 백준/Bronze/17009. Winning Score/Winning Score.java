import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt()*3+sc.nextInt()*2+sc.nextInt();
        int b = sc.nextInt()*3+sc.nextInt()*2+sc.nextInt();
        System.out.println((a>b) ? "A" : ((a<b) ? "B" : "T"));
    }
}