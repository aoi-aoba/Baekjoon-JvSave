import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger result = BigInteger.ZERO;
        for(int i = 1; i < N; i++) {
            BigInteger smallCase = (BigInteger.valueOf(N)).multiply(BigInteger.valueOf(i)).add(BigInteger.valueOf(i));
            result = result.add(smallCase);
        }
        System.out.println(result);
        br.close();
    }
}