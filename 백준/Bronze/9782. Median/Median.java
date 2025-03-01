import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
         int caseNum = 0;
         while(true) {
             int n = sc.nextInt();
             if(n == 0) return;
             caseNum++;
             System.out.print("Case " + caseNum + ": ");
             int[] arr = new int[n];
             Arrays.fill(arr, 0);
             for(int i=0; i<n; i++) {
                 arr[i] = sc.nextInt();
             }
             if(n % 2 == 0) System.out.println((arr[n/2-1] + arr[n/2])/2.0);
             else System.out.println((double)arr[(n-1)/2]);
         }
    }
}