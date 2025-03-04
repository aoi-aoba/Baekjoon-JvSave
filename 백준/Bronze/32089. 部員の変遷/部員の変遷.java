import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine()), max = 0;
            if(n == 0) break;
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());
            for (int i = 0; i < arr.length; i++) {
                int temp = 0;
                if (i == 0) temp = arr[0];
                else if (i == 1) temp = arr[0] + arr[1];
                else temp = arr[i - 2] + arr[i - 1] + arr[i];
                max = Math.max(max, temp);
            }
            sb.append(max).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}