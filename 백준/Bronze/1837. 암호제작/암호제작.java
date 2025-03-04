import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger pq = new BigInteger(st.nextToken());
        BigInteger k = new BigInteger(st.nextToken());
        BigInteger i = new BigInteger("1");
        String answer = "";

        while(true) {
            if(i.compareTo(k) == 1 || i.compareTo(k) == 0) {
                sb.append("GOOD");
                break;
            }

            i = i.add(BigInteger.ONE);

            if(pq.remainder(i).compareTo(BigInteger.ZERO) == 0 && i.compareTo(k) == -1) {
                sb.append("BAD").append(" ").append(i);
                break;
            }
        }

        System.out.println(sb);
        br.close();
    }
}