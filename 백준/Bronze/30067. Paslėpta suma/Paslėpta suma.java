import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int sum = 0;
        for(int i=0; i<10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        for(int i=0; i<10; i++) {
            if(arr[i] == sum - arr[i]) {
                System.out.println(arr[i]);
                return;
            }
        }
        br.close();
    }
}