import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) arr[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            System.out.println((arr[N-1]-arr[0])*2);
        }
        br.close();
    }
}