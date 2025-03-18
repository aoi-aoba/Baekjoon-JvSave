import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] arr = new int[100];
        Arrays.fill(arr, 0);
        for(int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            for(int j=start; j<end; j++) arr[j]++;
        }

        int result = 0;
        for(int i=0; i<100; i++) {
            switch (arr[i]) {
                case 1 -> result += A;
                case 2 -> result += B * 2;
                case 3 -> result += C * 3;
            }
        }

        System.out.println(result);
        br.close();
    }
}