import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;

         st = new StringTokenizer(br.readLine());

         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         int c = Integer.parseInt(st.nextToken());

         int[] arr1 = {a, b, c};
         Arrays.sort(arr1);

         if(arr1[0] == arr1[1] || arr1[1] == arr1[2] || arr1[0] + arr1[1] == arr1[2]) {
             System.out.println("S");
         } else {
             System.out.println("N");
         }
    }
}