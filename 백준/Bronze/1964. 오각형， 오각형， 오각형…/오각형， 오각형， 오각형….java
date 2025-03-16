import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine()), res = 0;
        for(int k = 1; k <= i; k++) {
            res += k * 5;
            if(k != 1) res -= (2 * k) - 1;
            if(res >= 45678) res %= 45678;
        }
        System.out.println(res);
    }
}