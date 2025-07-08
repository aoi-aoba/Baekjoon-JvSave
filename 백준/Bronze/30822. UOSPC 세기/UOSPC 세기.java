import java.io.*;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(in.readLine()), cnt = N;
         char[] str = in.readLine().toCharArray();
         int[] arr = new int[5];
         for (char ch : str) {
             if (ch == 'u') arr[0]++;
             else if (ch == 'o') arr[1]++;
             else if (ch == 's') arr[2]++;
             else if (ch == 'p') arr[3]++;
             else if (ch == 'c') arr[4]++;
         }
         for (int i = 0; i < 5; i++)
             cnt = Math.min(cnt, arr[i]);
         System.out.println(cnt);
     }
}