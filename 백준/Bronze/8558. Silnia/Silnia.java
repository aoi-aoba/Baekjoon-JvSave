import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = BigInteger.valueOf(Long.parseLong(br.readLine()));
        BigInteger answer = new BigInteger("1");
        for(int i=2; i<=n.intValue(); i++) {
            answer = answer.multiply(BigInteger.valueOf(i));
            answer = answer.remainder(new BigInteger("10"));
        }
        System.out.println(answer);
        br.close();
    }
}