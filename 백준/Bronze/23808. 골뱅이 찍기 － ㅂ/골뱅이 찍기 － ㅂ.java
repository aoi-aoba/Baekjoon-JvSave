import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T * 2; i++) {
            System.out.print("@".repeat(T));
            System.out.print("   ".repeat(T));
            System.out.println("@".repeat(T));
        }
        for (int i = 0; i < T; i++) System.out.println("@".repeat(5 * T));
        for (int i = 0; i < T; i++) {
            System.out.print("@".repeat(T));
            System.out.print("   ".repeat(T));
            System.out.println("@".repeat(T));
        }
        for (int i = 0; i < T; i++) System.out.println("@".repeat(5 * T));
        br.close();
    }
}