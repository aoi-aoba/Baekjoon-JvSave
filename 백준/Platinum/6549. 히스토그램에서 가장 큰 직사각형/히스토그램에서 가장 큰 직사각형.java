import java.io.*;
import java.util.*;

public class Main {
    public static int[] arr;
    public static long conquer(int start, int mid, int end) {
        int left = mid, right = mid + 1;
        long height = Math.min(arr[left], arr[right]);
        long mx = height * 2;

        while (!(left == start && right == end)) {
            if (left == start) height = Math.min(arr[++right], height);
            else if (right == end) height = Math.min(arr[--left], height);
            else {
                if (arr[left - 1] > arr[right + 1]) height = Math.min(arr[--left], height);
                else height = Math.min(arr[++right], height);
            }
            mx = Math.max(height * (right - left + 1), mx);
        }

        return mx;
    }
    public static long divide(int start, int end) {
        if (start == end) return arr[start];
        int mid = (start + end) / 2;
        return Math.max(conquer(start, mid, end), Math.max(divide(start, mid), divide(mid + 1, end)));
    }
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       while (true) {
           String str = br.readLine();
           if (str.charAt(0) == '0') break;

           StringTokenizer st = new StringTokenizer(str);
           int n = Integer.parseInt(st.nextToken());
           arr = new int[n];
           for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

           System.out.println(divide(0, n-1));
       }
    }
}