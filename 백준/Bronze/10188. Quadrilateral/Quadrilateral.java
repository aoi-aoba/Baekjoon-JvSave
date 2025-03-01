import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
         int T = sc.nextInt();
         for(int i=0; i<T; i++) {
             int x = sc.nextInt();
             int y = sc.nextInt();
             for(int j=0; j<y; j++) {
                 for(int k=0; k<x; k++) {
                     System.out.print("X");
                 }
                 System.out.println();
             }
             System.out.println();
         }
    }
}