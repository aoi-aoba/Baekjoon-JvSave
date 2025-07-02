import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String magnets = br.readLine();
        for (int i = 1; i < 2 * N; i++) {
            if (magnets.charAt(i-1) == magnets.charAt(i)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}