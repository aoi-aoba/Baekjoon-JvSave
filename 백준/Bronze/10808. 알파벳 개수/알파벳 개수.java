import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, 0);
        String s = sc.next();
        for(int i=0; i<s.length(); i++)
            alphabet[s.charAt(i)-'a']++;
        for(int i=0; i<26; i++)
            System.out.print(alphabet[i] + " ");
        sc.close();
    }
}