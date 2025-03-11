import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long sum = 0;
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++)
            arr[i] = Long.parseLong(st.nextToken());
        long size = Long.parseLong(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / size + (arr[i] % size > 0 ? 1 : 0);
            sum += size * arr[i];
        }
        System.out.println(sum);
        br.close();
    }
}