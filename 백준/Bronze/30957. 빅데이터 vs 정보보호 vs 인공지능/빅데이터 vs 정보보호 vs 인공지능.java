import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(in.readLine()), max = 0;
         String str = in.readLine();
         int[] arr = new int[3]; // B - S - A
         for (int i = 0; i < N; i++) {
             if (str.charAt(i) == 'B') max = Math.max(++arr[0], max);
             else if (str.charAt(i) == 'S') max = Math.max(++arr[1], max);
             else max = Math.max(++arr[2], max);
         }
         if (arr[0] == arr[1] && arr[1] == arr[2]) System.out.println("SCU");
         else for (int i = 0; i < 3; i++)
             if (max == arr[i]) System.out.print(i == 0 ? "B" : i == 1 ? "S" : "A");
         in.close();
     }
}