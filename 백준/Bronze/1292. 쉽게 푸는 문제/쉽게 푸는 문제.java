import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());

        int[] arr = new int[1000];
        int j = 1, j_cnt = 0;
        for(int i=0; i<1000; i++) {
            arr[i] = j;
            j_cnt++;
            if(j_cnt == j) {
                j++;
                j_cnt = 0;
            }
        }

        int sum = 0;
        for(int i=start-1; i<end; i++)
            sum += arr[i];
        System.out.println(sum);
        br.close();
    }
}