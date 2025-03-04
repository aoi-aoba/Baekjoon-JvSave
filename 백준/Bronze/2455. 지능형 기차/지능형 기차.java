import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[4];
        for(int i=0; i<4; i++) {
            st = new StringTokenizer(br.readLine());
            int drop = Integer.parseInt(st.nextToken());
            int ride = Integer.parseInt(st.nextToken());
            if (i == 0) arr[i] = ride;
            else arr[i] = arr[i - 1] + ride - drop;
        }
        Arrays.sort(arr);
        System.out.println(arr[3]);
        br.close();
    }
}