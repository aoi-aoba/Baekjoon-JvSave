import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long N = Long.parseLong(br.readLine());
        while(N != 1) {
            sb.append(N % 2);
            N /= 2;
        }
        sb.append(N);
        System.out.println(sb.reverse());
    }
}