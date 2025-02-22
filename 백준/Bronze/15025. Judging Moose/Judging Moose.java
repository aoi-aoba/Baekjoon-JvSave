import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        if (L == 0 && R == 0) {
            System.out.print("Not a moose");
        }
        else if (L == R) {
            System.out.print("Even " + (L + R));
        }
        else if (L != R) {
            if (L > R) {
                System.out.print("Odd " + (L + L));
            }
            else if (L < R) {
                System.out.print("Odd " + (R + R));
            }
        }
        br.close();
    }
}