import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int a = Integer.parseInt(br.readLine());
         int b = Integer.parseInt(br.readLine());
         for(int i=a; i<=b; i+=60){
             System.out.println("All positions change in year "+i);
         }
    }
}