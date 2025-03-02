import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int s = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if(a > s) {System.out.println(250); return;}
        int n = (s-a) % b == 0 ? (s-a)/b : (s-a)/b+1;
        System.out.println(250 + n * 100);
        br.close();
    }
}