import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        while(str != null) {
            int n = Integer.parseInt(str);
            if(n == 1) System.out.println(1);
            else {
                BigInteger result = new BigInteger("1");
                while(true) {
                    result = result.multiply(BigInteger.TEN).add(BigInteger.valueOf(1));
                    if (result.remainder(BigInteger.valueOf(n)).compareTo(BigInteger.ZERO) == 0)
                        break;
                }
                System.out.println(String.valueOf(result).length());
            }
            str = br.readLine();
        }
        br.close();
    }
}