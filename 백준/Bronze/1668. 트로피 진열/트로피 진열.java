import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cntLeft = 0, cntRight = 0, maxLeft = 0, maxRight = 0;
        int[] arr = new int[N];
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            if(maxLeft < arr[i]) {
                maxLeft = arr[i];
                cntLeft++;
            }
        }

        for(int i=N-1; i>=0; i--) {
            if(maxRight < arr[i]) {
                maxRight = arr[i];
                cntRight++;
            }
        }

        System.out.println(cntLeft);
        System.out.println(cntRight);

        br.close();
    }
}