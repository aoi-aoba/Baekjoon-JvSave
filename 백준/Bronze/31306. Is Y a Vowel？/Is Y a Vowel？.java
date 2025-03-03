import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int noYVowel = 0, yIsVowel = 0;
        for(int i=0; i<str.length(); i++) {
            switch(str.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> noYVowel++;
                case 'y' -> {
                    yIsVowel++;
                }
            }
        }
        System.out.println(noYVowel + " " + (noYVowel+yIsVowel));
        br.close();
    }
}