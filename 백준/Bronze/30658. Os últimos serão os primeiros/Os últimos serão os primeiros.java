import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            int[] arr = new int[N];
            for(int i=0; i<N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            for(int i=N-1; i>=0; i--) {
                sb.append(arr[i]).append("\n");
            }
            sb.append(0).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}