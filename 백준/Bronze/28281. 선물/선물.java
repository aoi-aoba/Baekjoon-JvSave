import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int minPrice = Integer.MAX_VALUE;
        int[] arr = new int[N-1];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int dayPrice = Integer.parseInt(st.nextToken());
            if(i == 0) arr[i] += dayPrice * X;
            else if(i != N-1) {
                arr[i-1] += dayPrice * X;
                arr[i] += dayPrice * X;
                minPrice = Math.min(minPrice, arr[i-1]);
            } else {
                arr[i-1] += dayPrice * X;
                minPrice = Math.min(minPrice, arr[i-1]);
            }
        }
        System.out.println(minPrice);
        br.close();
    }
}