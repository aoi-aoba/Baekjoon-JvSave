import java.io.*;
import java.util.*;

public class Main {
    public static void repeatMethod(int[] arr) {
        int abs1 = Math.abs(arr[0]-arr[1]);
        int abs2 = Math.abs(arr[1]-arr[2]);
        int abs3 = Math.abs(arr[2]-arr[3]);
        int abs4 = Math.abs(arr[3]-arr[0]);
        arr[0] = abs1;
        arr[1] = abs2;
        arr[2] = abs3;
        arr[3] = abs4;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<4; i++) arr[i] = Integer.parseInt(st.nextToken());
            if(arr[0] == arr[1] && arr[2] == arr[3] && arr[1] == arr[2] && arr[0] == 0) break;
            int repeatNum = 0;
            while(true) {
                if(arr[0] == arr[1] && arr[2] == arr[3] && arr[1] == arr[2]) break;
                repeatMethod(arr);
                repeatNum++;
            }
            System.out.println(repeatNum);
        }
        br.close();
    }
}