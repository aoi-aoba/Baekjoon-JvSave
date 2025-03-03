import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int res = p * 50 - c * 10 + ((p > c) ? 500 : 0);
        System.out.println(res);
        br.close();
    }
}