import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long[] sum = new long[1000001];
        long[] arr = new long[1000001];
        Arrays.fill(sum, 1);
        for(int i=2; i<sum.length; i++) {
            for(int j=0; j*i<sum.length; j++) {
                sum[i*j] += i;
            }
        }
        for(int i=1; i<arr.length; i++) {
            arr[i] = arr[i-1] + sum[i];
        }
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int input = Integer.parseInt(br.readLine());
            sb.append(arr[input]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}