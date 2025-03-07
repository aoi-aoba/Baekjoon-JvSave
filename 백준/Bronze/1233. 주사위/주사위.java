import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int side_a = Integer.parseInt(st.nextToken());
        int side_b = Integer.parseInt(st.nextToken());
        int side_c = Integer.parseInt(st.nextToken());

        int[] arr = new int[81]; // 세 주사위의 최대 면 개수는 20+20+40
        Arrays.fill(arr, 0);

        for(int i=1; i<=side_a; i++)
            for(int j=1; j<=side_b; j++)
                for(int k=1; k<=side_c; k++)
                    arr[i+j+k]++;

        int max = 0, max_i = 0;
        for(int i=3; i<81; i++) {
            if(arr[i] > max) {
                max = arr[i];
                max_i = i;
            }
        }
        System.out.println(max_i);
        br.close();
    }
}