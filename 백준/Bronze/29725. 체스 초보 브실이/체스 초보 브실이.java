import java.io.*;
import java.util.*;

public class Main {
    public static int score(char c) {
        if(c == 'k') return 0;
        else if(c == 'K') return 0;
        else if(c == 'p') return -1;
        else if(c == 'P') return 1;
        else if(c == 'n' || c == 'b') return -3;
        else if(c == 'N' || c == 'B') return 3;
        else if(c == 'r') return -5;
        else if(c == 'R') return 5;
        else if(c == 'q') return -9;
        else if(c == 'Q') return 9;
        else return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        for(int i=0; i<8; i++) {
            String str = br.readLine();
            for(int j=0; j<str.length(); j++) {
                res += score(str.charAt(j));
            }
        }
        System.out.println(res);
    }
}