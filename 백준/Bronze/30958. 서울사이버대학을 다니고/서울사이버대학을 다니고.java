import java.io.*;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int length = Integer.parseInt(in.readLine()), max = 0;
         String str = in.readLine();
         int[] alphabet = new int[26];
         for (int i = 0; i < length; i++)
             if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                 alphabet[str.charAt(i) - 'a']++;
         for (int temp : alphabet)
             max = Math.max(temp, max);
         System.out.println(max);
     }
}