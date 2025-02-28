import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        System.out.print((t > 30) ? 21*(t-30)*x+a : a);
        System.out.print(" ");
        System.out.print((t > 45) ? 21*(t-45)*y+b : b);
        br.close();
    }
}