import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int happiness = sc.nextInt()+2*sc.nextInt()+3*sc.nextInt();
        System.out.println((happiness >= 10) ? "happy" : "sad");
        sc.close();
    }
}