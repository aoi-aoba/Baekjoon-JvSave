import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        int arr_max = -1;

        for(int i=0; i<N; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr[temp]++;
            arr_max = Math.max(arr_max, temp);
        }

        for(int i=0; i<=arr_max; i++) {
            if(arr[i] != 0)
                sb.append(String.valueOf(i + "\n").repeat(arr[i]));
        }

        System.out.println(sb);
        br.close();
    }
}