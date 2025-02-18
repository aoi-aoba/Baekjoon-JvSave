import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] st = br.readLine().toCharArray();
        double score = 0;
        if(st[0] == 'F') {
            System.out.println(score);
            return;
        } else {
            if(st[0] == 'A') score += 4.0;
            else if(st[0] == 'B') score += 3.0;
            else if(st[0] == 'C') score += 2.0;
            else score += 1.0;
            if(st[1] == '+') score += 0.3;
            if(st[1] == '-') score -= 0.3;
        }
        System.out.println(score);
    }
}