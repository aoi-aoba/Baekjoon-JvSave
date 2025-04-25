import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isPalindrome(String word) {
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        boolean allSameWord = true;
        int res = 0;
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(0) != word.charAt(i)) {
                allSameWord = false;
                break;
            }
        }
        
        if (allSameWord) res = -1;
        else if (isPalindrome(word)) res = word.length() - 1;
        else res = word.length();
        System.out.println(res);
    }
}