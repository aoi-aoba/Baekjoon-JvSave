import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {0, 0, 0};
        for(int i=0; i<3; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[temp]++;
        }
        System.out.println(arr[1] > arr[2] ? 1 : 2);
        br.close();
    }
}