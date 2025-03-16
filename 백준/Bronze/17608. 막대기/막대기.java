import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int prev_max = 0, cnt = 0;
        int[] arr = new int[N];
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(br.readLine());
        for(int i=N-1; i>=0; i--) {
            if(prev_max < arr[i]) {
                cnt++;
                prev_max = arr[i];
            }
        }
        System.out.println(cnt);
        br.close();
    }
}