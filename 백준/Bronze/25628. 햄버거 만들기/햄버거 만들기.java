import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bun = sc.nextInt();
        int patty = sc.nextInt();
        System.out.println(Math.min(bun/2, patty));
    }
}