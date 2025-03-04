import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            char[] arr = br.readLine().toCharArray();
            int a = 0, b = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[j] == 'a') a++;
                else b++;
            }
            System.out.println(Math.min(a, b));
        }
        br.close();
    }
}