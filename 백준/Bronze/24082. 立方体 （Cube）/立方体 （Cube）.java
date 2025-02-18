import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long cube = x*x*x;
        System.out.println(cube);
    }
}