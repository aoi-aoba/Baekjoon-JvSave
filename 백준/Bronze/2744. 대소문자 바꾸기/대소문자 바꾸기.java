import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] st = br.readLine().toCharArray();
        for(int i=0; i<st.length; i++) {
            if(Character.isUpperCase(st[i]))
                sb.append(Character.toLowerCase(st[i]));
            if(Character.isLowerCase(st[i]))
                sb.append(Character.toUpperCase(st[i]));
        }
        System.out.println(sb);
    }
}