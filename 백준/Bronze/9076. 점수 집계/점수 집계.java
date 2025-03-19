import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[5];
            for(int j=0; j<5; j++) arr[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            int threeAdd = arr[1] + arr[2] + arr[3];
            int maxMinusMin = arr[3] - arr[1];
            System.out.println(maxMinusMin >= 4 ? "KIN" : threeAdd);
        }
        br.close();
    }
}