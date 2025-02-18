import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = 0, B = 0;
        A += 6*sc.nextInt()+3*sc.nextInt()+2*sc.nextInt()+sc.nextInt()+2*sc.nextInt();
        B += 6*sc.nextInt()+3*sc.nextInt()+2*sc.nextInt()+sc.nextInt()+2*sc.nextInt();
        System.out.println(A + " " + B);
    }
}