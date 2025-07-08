import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int T = Integer.parseInt(in.readLine()), left = -2, right = -2, interested = 0;
         while (T-- > 0) {
             StringTokenizer st = new StringTokenizer(in.readLine());
             int leftNow = Integer.parseInt(st.nextToken()), rightNow = Integer.parseInt(st.nextToken());
             if (leftNow == left && leftNow != 0) interested++;
             if (rightNow == right && rightNow != 0) interested++;
             if (leftNow == rightNow && leftNow != 0) interested++;
             left = leftNow;
             right = rightNow;
         }
         System.out.println(interested);
         in.close();
     }
}