import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[10];
        Arrays.fill(arr, false);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[temp] = true;
        }
        for(int i=0; i<10; i++) {
            if(arr[i]) System.out.println(i);
        }
        br.close();
    }
}