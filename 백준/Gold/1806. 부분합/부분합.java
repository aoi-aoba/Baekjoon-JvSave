import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int left = 0, right = 0, sum = 0;
        int len = Integer.MAX_VALUE;

        while (true) {
            if (sum >= S) {
                len = Math.min(len, right - left);
                sum -= arr[left++];
            } else if (right == N) break;
            else sum += arr[right++];
        }

        System.out.println(len == Integer.MAX_VALUE ? 0 : len);
    }
}