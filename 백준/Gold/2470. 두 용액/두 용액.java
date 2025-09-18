import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int leftIdx = 0, rightIdx = n - 1, l = 0, r = n - 1;
        int stdSum = 2000000000;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (Math.abs(sum) < stdSum) {
                leftIdx = l;
                rightIdx = r;
                stdSum = Math.abs(sum);
            }

            if (sum < 0) l++;
            else r--;
        }

        System.out.println(arr[leftIdx] + " " + arr[rightIdx]);
    }
}