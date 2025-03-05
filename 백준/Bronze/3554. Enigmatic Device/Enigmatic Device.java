import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if(k == 1) {
                for(int i=l-1; i<r; i++) {
                    arr[i] *= arr[i];
                    arr[i] %= 2010;
                }
            } else {
                int sum = 0;
                for(int i=l-1; i<r; i++)
                    sum += arr[i];
                sb.append(sum).append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}