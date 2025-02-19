import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        System.out.print((s > f) ? "flight" : "high speed rail");
    }
}