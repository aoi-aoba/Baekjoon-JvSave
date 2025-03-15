import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine(), key = br.readLine();
        for(int i=0; i<str.length(); i++) {
            int indexForKey = (i >= key.length()) ? i % key.length() : i;
            if(str.charAt(i) == ' ') sb.append(" ");
            else {
                int between = str.charAt(i) - key.charAt(indexForKey);
                if(between < 0) sb.append((char)('a' + 25 + between));
                else if(between == 0) sb.append('z');
                else sb.append((char)('a' + between - 1));
            }
        }

        System.out.println(sb);
        br.close();
    }
}