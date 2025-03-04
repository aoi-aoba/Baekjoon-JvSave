import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<3; i++) {
            BigInteger sum = BigInteger.ZERO;
            int n = Integer.parseInt(br.readLine());
            for(int j=0; j<n; j++)
                sum = sum.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
            sb.append((sum.compareTo(BigInteger.ZERO) < 0) ? "-" : (sum.compareTo(BigInteger.ZERO) > 0 ? "+" : 0)).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}