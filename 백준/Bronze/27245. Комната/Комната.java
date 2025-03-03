import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int w = Integer.parseInt(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());

        int a = Math.min(w, l);
        int b = Math.max(w, l);
        System.out.println(a * 2 >= b && a >= h * 2 ? "good" : "bad");

        br.close();
    }
}