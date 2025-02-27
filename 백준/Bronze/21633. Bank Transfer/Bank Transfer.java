import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        double res = k * 0.01 + 25;
        if(res < 100) res = 100;
        else if(res > 2000) res = 2000;
        System.out.printf("%.2f", res);
    }
}