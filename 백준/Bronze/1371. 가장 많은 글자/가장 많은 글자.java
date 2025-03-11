import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        while(true) {
            String str = br.readLine();
            if(str == null) break;
            else {
                char[] strToCharArray = str.toCharArray();
                for(char c : strToCharArray)
                    if(c >= 'a' && c <= 'z') alphabet[c - 'a']++;
            }
        }
        int max = 0;
        String res = "";
        for(int i = 0; i < 26; i++) {
            if(max < alphabet[i]) {
                max = alphabet[i];
                res = String.valueOf((char) (i + 'a'));
            } else if(max == alphabet[i]) res += String.valueOf((char) (i + 'a'));
        }
        System.out.println(res);
        br.close();
    }
}