import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str1 = br.readLine();
        String plOrMu = br.readLine();
        String str2 = br.readLine();

        int a1 = str1.length() - 1, a2 = str2.length() - 1;
        if(plOrMu.equals("*")) {
            sb.append(1);
            for(int i=0; i<a1+a2; i++) sb.append(0);
        } else {
            if(a1 != a2) {
                int max = Math.max(a1, a2);
                int min = Math.min(a1, a2);
                sb.append(1);
                for (int i = 0; i < max - min - 1; i++) sb.append(0);
                sb.append(1);
                for (int i = 0; i < min; i++) sb.append(0);
            } else {
                sb.append(2);
                for (int i = 0; i < a1; i++) sb.append(0);
            }
        }

        System.out.println(sb);
        br.close();
    }
}