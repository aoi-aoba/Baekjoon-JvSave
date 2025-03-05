import java.io.*;
import java.util.*;

public class Main {
    public static void rotate(int[][] arr) {
        int temp = arr[0][0];
        arr[0][0] = arr[1][0];
        arr[1][0] = arr[1][1];
        arr[1][1] = arr[0][1];
        arr[0][1] = temp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[2][2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0][0] = Integer.parseInt(st.nextToken());
        arr[0][1] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr[1][0] = Integer.parseInt(st.nextToken());
        arr[1][1] = Integer.parseInt(st.nextToken());

        int spin = 0;
        double max = 0;
        for(int i=0; i<4; i++) {
            double res = (double)arr[0][0] / (double)arr[1][0] + (double)arr[0][1] / (double)arr[1][1];
            if(max < res) {
                spin = i;
                max = res;
            }
            rotate(arr);
        }
        System.out.println(spin);
        br.close();
    }
}