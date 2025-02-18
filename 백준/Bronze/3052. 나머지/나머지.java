import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] remainder = new int[43];
        Arrays.fill(remainder, 0);
        for(int i=0; i<10; i++) {
            int temp = Integer.parseInt(br.readLine()) % 42;
            remainder[temp+1]++;
        }
        int remainders = 0;
        for(int i=1; i<=42; i++)
            if(remainder[i] != 0) remainders++;
        System.out.println(remainders);
    }
}