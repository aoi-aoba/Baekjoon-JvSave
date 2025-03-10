import java.io.*;
import java.util.*;

public class Main {
    public static int cntRecursion = 0;
    public static int recursion(String s, int l, int r){
        cntRecursion++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            cntRecursion = 0;
            String str = br.readLine();
            int a = isPalindrome(str);
            int b = cntRecursion;
            System.out.println(a + " " + b);
        }
    }
}