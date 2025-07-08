import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int T = Integer.parseInt(in.readLine()), upper = 0, jinju = 0;

         class Terminal {
             String name;
             int fee;
             public Terminal(String name, int fee) {
                 this.name = name;
                 this.fee = fee;
             }
         }

         ArrayList<Terminal> list = new ArrayList<>();
         for (int i = 0; i < T; i++) {
             StringTokenizer st = new StringTokenizer(in.readLine());
             String name = st.nextToken();
             int fee = Integer.parseInt(st.nextToken());
             list.add(new Terminal(name, fee));
             if (name.equals("jinju")) jinju = fee;
         }

         for (Terminal terminal : list) if (terminal.fee > jinju) upper++;

         System.out.println(jinju);
         System.out.println(upper);
     }
}