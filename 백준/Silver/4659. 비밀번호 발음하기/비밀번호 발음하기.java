import java.io.*;
import java.util.*;

public class Main {
    public static boolean isVowel(char ch) {
        if(ch == 'a') return true;
        else if(ch == 'e') return true;
        else if(ch == 'i') return true;
        else if(ch == 'o') return true;
        else return (ch == 'u');
    }

    public static boolean isPwValid(String pw) {
        int isBackVowel = 0, valOfVowel = 0;
        char backChar = ' ';
        for(int i=0; i<pw.length(); i++) {
            char checkChar = pw.charAt(i);
            if(isVowel(checkChar)) {
                if(isBackVowel < 0) isBackVowel = 0;
                isBackVowel++;
                valOfVowel++;
            } else {
                if(isBackVowel > 0) isBackVowel = 0;
                isBackVowel--;
            }
            if(Math.abs(isBackVowel) == 3) return false;
            if(backChar == checkChar && (backChar != 'e' && backChar != 'o')) {
                return false;
            }
            backChar = pw.charAt(i);
        }
        if(valOfVowel == 0) return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String str = br.readLine();
            if(str.equals("end")) break;
            else if(isPwValid(str)) {
                sb.append("<").append(str).append("> is acceptable.").append("\n");
            } else {
                sb.append("<").append(str).append("> is not acceptable.").append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}