import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) System.out.println("@@@@@".repeat(n));
        for (int i = 0; i < 3 * n; i++) {
            System.out.print("@".repeat(n));
            System.out.print(" ".repeat(3 * n));
            System.out.println("@".repeat(n));
        }
        for (int i = 0; i < n; i++) System.out.println("@@@@@".repeat(n));
        br.close();
    }
}