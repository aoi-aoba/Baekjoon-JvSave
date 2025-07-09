import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());
         int N = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken()), max = 0, cnt = 0;
         int[] arr = new int[N];
         for (int i = 0; i < N; i++) {
             String zebra = br.readLine();
             int prev = zebra.charAt(0) - '0', black = prev == 1 ? 1 : 0;
             for (int j = 1; j < L; j++) {
                 if (prev == 0 && zebra.charAt(j) - '0' != prev) black++;
                 prev = zebra.charAt(j) - '0';
             }
             max = Math.max(max, (arr[i] = black));
         }
         for (int temp : arr) if (temp == max) cnt++;
         System.out.println(max + " " + cnt);
     }
}