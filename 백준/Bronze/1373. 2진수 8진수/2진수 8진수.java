import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine()).reverse();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<sb.length(); i+=3) {
            int oct = 0;
            if(i+2 == sb.length()) oct = (sb.charAt(i) - '0') + 2 * (sb.charAt(i + 1) - '0');
            else if(i+1 == sb.length()) oct = sb.charAt(i) - '0';
            else oct = (sb.charAt(i) - '0') + 2 * (sb.charAt(i + 1) - '0') + 4 * (sb.charAt(i + 2) - '0');
            res.append(oct);
        }
        System.out.println(res.reverse());
        br.close();
    }
}