import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), sum = 0;
        for(int i = 0; i < N; i++) {
            sum += Integer.parseInt(br.readLine());
        }
        System.out.println(sum - N + 1);
        br.close();
    }
}