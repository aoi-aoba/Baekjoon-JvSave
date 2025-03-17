import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int average = 0, modeNum = 0;
        int[] arr = new int[101];
        for(int i=0; i<10; i++) {
            int temp = Integer.parseInt(br.readLine());
            average += temp;
            arr[temp / 10]++;
        }
        for(int i=1; i<101; i++) {
            if(arr[i] > modeNum)
                modeNum = i;
        }
        System.out.println(average / 10);
        System.out.println(modeNum * 10);
        br.close();
    }
}