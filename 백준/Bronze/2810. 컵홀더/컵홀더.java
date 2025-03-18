import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cupHolder = 0, N = Integer.parseInt(br.readLine());
        char prev = ' ';
        String str = br.readLine();
        for(int i=0; i<N; i++) {
            char now = str.charAt(i);
            if(prev == ' ') cupHolder++;
            else if(prev == 'S') cupHolder++;
            else if(prev == 'L' && now == 'L') {
                cupHolder++;
                prev = '?';
                continue;
            }
            prev = now;
        }
        if(prev != '?') cupHolder++;
        System.out.println(Math.min(cupHolder, N));
        br.close();
    }
}