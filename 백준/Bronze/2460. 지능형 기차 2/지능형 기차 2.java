import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max = 0, prev = 0;

        for(int i=0; i<10; i++) {
            st = new StringTokenizer(br.readLine());
            int drop = Integer.parseInt(st.nextToken());
            int ride = Integer.parseInt(st.nextToken());
            int temp = prev - drop + ride;
            max = Math.max(max, temp);
            prev = temp;
        }

        System.out.println(max);
        br.close();
    }
}