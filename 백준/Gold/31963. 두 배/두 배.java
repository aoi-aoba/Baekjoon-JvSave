import java.io.*;
import java.util.*;

public class Main {
    public static long solve(int[] arr, int n) {
        // arr[i]가 이전 수 arr[i - 1]에 대해 arr[i - 1] * 2^x 이상이려면 arr[i] * 2^y라고 할 때
        // arr[i] * 2^y >= arr[i-1] * 2^x이고 밑 2인 양변로그 시 x+log2(arr[i-1]) <= y+log2(arr[i])
        // 즉 이때 y >= x + log2(arr[i-1]/arr[i]) 라는 결론이 나오게 됨
        long result = 0;
        long[] cntArr = new long[n];
        for (int i = 1; i < n; i++) {
            double ratio = Math.ceil(Math.log(arr[i - 1] / (double) arr[i]) / Math.log(2)) + cntArr[i - 1];
            if (ratio > 0) {
                cntArr[i] = Math.max(0, (long) ratio);
                result += cntArr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        bw.write(solve(arr, n) + "\n");
        bw.flush();
    }
}