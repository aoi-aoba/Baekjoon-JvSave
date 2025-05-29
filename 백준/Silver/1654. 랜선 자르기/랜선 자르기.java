import java.io.*;
import java.util.*;

public class Main {
    public static long target;
    public static long binarySearch(long[] arr, long low, long high) {
        if (low > high) return high;
        long mid = (low + high) / 2, num = 0;
        for (long temp : arr) num += temp / mid;
        if (num < target) return binarySearch(arr, low, mid-1);
        else return binarySearch(arr, mid+1, high);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        long max = 0;
        target = Integer.parseInt(st.nextToken());
        long[] arr = new long[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(arr[i], max);
        }
        System.out.println(binarySearch(arr, 1, max));
        br.close();
    }
}