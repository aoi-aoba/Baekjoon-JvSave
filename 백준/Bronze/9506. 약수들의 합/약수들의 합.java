import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            if(n == -1) break;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }
            if(n == sum) {
                sb.append(n).append(" = ");
                for(int i = 0; i < list.size(); i++) {
                    sb.append(String.valueOf(list.get(i)));
                    if(i != list.size() - 1) sb.append(" + ");
                    else sb.append("\n");
                }
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }
        }
        System.out.print(sb);
        br.close();
    }
}