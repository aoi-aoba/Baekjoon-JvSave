import java.util.*;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         StringBuilder sb = new StringBuilder();
         int T = sc.nextInt();
         for(int i=0; i<T; i++) {
             int testerNum = sc.nextInt();
             sb.append(testerNum).append(" ");

             int strVal = sc.nextInt();
             int busVal = sc.nextInt();
             int tecVal = sc.nextInt();
             int totVal = strVal + busVal + tecVal;
             sb.append(totVal).append(" ");

             if(strVal >= 35*0.3 && busVal >= 25*0.3 && tecVal >= 40*0.3 && totVal >= 55)
                 sb.append("PASS").append("\n");
             else sb.append("FAIL").append("\n");
         }
         System.out.println(sb);
         sc.close();
    }
}