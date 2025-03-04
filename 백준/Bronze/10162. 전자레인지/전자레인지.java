import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = 300, B = 60, C = 10, N = Integer.parseInt(br.readLine());
        if(N % 10 > 0) System.out.println(-1);
        else {
            System.out.println(N/A + " " + N%A/B + " " + N%B/C);
        }
        br.close();
    }
}