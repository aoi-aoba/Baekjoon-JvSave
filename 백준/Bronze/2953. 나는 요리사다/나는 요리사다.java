import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[5];
        int maxVal = 0, maxIndex = 0;
        for(int i=0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++) {
                arr[i] += Integer.parseInt(st.nextToken());
            }
            if(maxVal < arr[i]) {
                maxIndex = i + 1;
                maxVal = arr[i];
            }
        }
        System.out.println(maxIndex + " " + maxVal);
        br.close();
    }
}