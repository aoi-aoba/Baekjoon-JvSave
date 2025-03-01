import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
         StringBuilder sb = new StringBuilder();
         char[] str = sc.nextLine().toCharArray();

         for (char c : str) {
             if (c != 'e') sb.append(c);
             else sb.append(c).append(c);
         }

         System.out.print(sb);
         sc.close();
    }
}