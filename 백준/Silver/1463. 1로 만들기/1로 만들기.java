import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[1000001];
        Arrays.fill(arr, 0);
        arr[1] = 0;
        for(int i=1; i<N; i++) {
            if(arr[i+1] > arr[i] + 1 || arr[i+1] == 0) arr[i+1] = arr[i] + 1;
            if(i * 2 < 1000001) if(arr[i*2] > arr[i] + 1 || arr[i*2] == 0) arr[i*2] = arr[i] + 1;
            if(i * 3 < 1000001) if(arr[i*3] > arr[i] + 1 || arr[i*3] == 0) arr[i*3] = arr[i] + 1;
        }
        System.out.println(arr[N]);
    }
}