import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int binarySearch(int[] arr, int val, int first, int last) {
        if (first > last) return -1;
        int mid = (first + last) / 2;
        if (val == arr[mid]) return mid;
        else if (val < arr[mid]) return binarySearch(arr, val, first, mid-1);
        else return binarySearch(arr, val, mid+1, last);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            int result = binarySearch(arr, temp, 0, arr.length-1) != -1 ? 1 : 0;
            sb.append(result).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}
