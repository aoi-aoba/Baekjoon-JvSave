import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);
         double p1 = sc.nextInt();
         double q1 = sc.nextInt();
         double p2 = sc.nextInt();
         double q2 = sc.nextInt();
         sc.close();
         
         double area = (p1*p2)/(q1*q2);
         System.out.println(area % 2 == 0 ? 1 : 0);
         sc.close();
    }
}