import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static Vector<Integer> getPi(String string) {
        int n = string.length(), j = 0;
        Vector<Integer> pi = new Vector<Integer>();
        pi.setSize(n);
        Collections.fill(pi, 0);
        for(int i = 1; i < n; i++) {
            while(j > 0 && string.charAt(i) != string.charAt(j)) j = pi.get(j - 1);
            if(string.charAt(i) == string.charAt(j)) pi.set(i, ++j);
        }
        return pi;
    }

    public static Vector<Integer> kmp(String string, String subString) {
        Vector<Integer> ans = new Vector<>();
        Vector<Integer> pi = getPi(subString);
        int n = string.length(), m = subString.length(), j = 0;
        for(int i = 0; i < n; i++) {
            while(j > 0 && string.charAt(i) != subString.charAt(j)) j = pi.get(j - 1);
            if(string.charAt(i) == subString.charAt(j)) {
                if(j == m - 1) {
                    ans.add(i - m + 1);
                    j = pi.get(j);
                } else j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int isHappy = kmp(str, ":-)").size();
        int isSad = kmp(str, ":-(").size();
        if(isHappy == 0 && isSad == 0) System.out.println("none");
        else if(isHappy > isSad) System.out.println("happy");
        else if(isHappy < isSad) System.out.println("sad");
        else System.out.println("unsure");
        br.close();
    }
}