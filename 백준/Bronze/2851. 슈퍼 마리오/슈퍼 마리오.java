import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int total = 0, ans = 0;
        for(int i=0; i<10; i++) arr[i] = Integer.parseInt(br.readLine());
        for(int i=0; i<10; i++) {
            total += arr[i];
            if(Math.abs(100 - total) <= Math.abs(100 - ans)) ans = total;
        }
        System.out.println(ans);
        br.close();
    }
}