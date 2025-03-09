import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        long res = 0, temp = 0;

        for(int i=0; i<L; i++) {
            temp = 0;
            temp += arr[i] - 'a' + 1;
            for(int j=0; j<i; j++) {
                temp *= 31;
                if(temp > Integer.MAX_VALUE) temp %= 1234567891;
            }
            res += temp;
        }

        System.out.println(res % 1234567891);
        br.close();
    }
}