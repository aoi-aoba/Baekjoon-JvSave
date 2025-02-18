import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), res = 0;
        while(true) {
            if(n < 1) break;
            n--;
            res += Integer.parseInt(br.readLine());
        }
        System.out.println(res);
    }
}