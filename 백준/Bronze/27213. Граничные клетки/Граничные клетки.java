import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if(a == 1 || b == 1) System.out.println(a + b - 1);
        else System.out.println((a + b) * 2 - 4);
        br.close();
    }
}