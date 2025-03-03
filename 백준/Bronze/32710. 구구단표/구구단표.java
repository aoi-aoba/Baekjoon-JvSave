import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), sign = 0;
        for(int i=1; i<10; i++) {
            if(N % i == 0 && N / i <= 9) {
                sign = 1;
                break;
            }
        }
        if(sign == 0) System.out.println("0");
        else System.out.println("1");
        br.close();
    }
}