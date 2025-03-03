import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[m];
            boolean isGood = true;
            sb.append("Denominations: ");
            for(int j=0; j<m; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sb.append(arr[j]).append(" ");
            }
            sb.append("\n");
            for(int j=1; j<m; j++) {
                if(arr[j-1] * 2 > arr[j]) isGood = false;
            }
            sb.append(isGood ? "Good coin denominations!" : "Bad coin denominations!").append("\n\n");
        }

        System.out.print(sb);
        br.close();
    }
}