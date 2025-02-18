import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alpha = new int[26];

        Arrays.fill(alpha, 0);
        for(int i=0; i<s.length(); i++) {
            char c;
            if(Character.isLowerCase(s.charAt(i)))
                c = Character.toUpperCase(s.charAt(i));
            else c = s.charAt(i);
            // Change all characters to Upper Case
            alpha[c-'A']++;
        }

        int max = 0;
        boolean notOneMax = false;
        char res = ' ';
        
        for(int i=0; i<26; i++) {
            if(alpha[i] > max) {
                notOneMax = false;
                max = alpha[i];
                res = (char)('A' + i);
                // if alphabet has max num, change max to that num and res become that alphabet
            } else if(alpha[i] == max) {
                notOneMax = true;
                // if alphabet has same max num, it has to return '?' mark
            }
        }
        if(!notOneMax) System.out.println(res);
        else System.out.println("?");
    }
}