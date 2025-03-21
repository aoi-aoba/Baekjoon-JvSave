import java.util.*;
import java.io.*;

public class Main {
    public static Vector<Integer> kmp(String s, String p) {
        Vector<Integer> res = new Vector<>();
        Vector<Integer> pi = getPi(p);
        int j = 0, m = p.length();
        for (int i = 0; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != p.charAt(j)) j = pi.get(j-1);
            if (s.charAt(i) == p.charAt(j)) {
                if (j == m - 1) {
                    res.add(i - m + 1);
                    j = 0;
                } else j++;
            }
        }
        return res;
    }
    public static Vector<Integer> getPi(String s) {
        int N = s.length(), j = 0;
        Vector<Integer> pi = new Vector<>();
        pi.setSize(N);
        Collections.fill(pi, 0);
        for (int i = 1; i < N; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) j = pi.get(j-1);
            if (s.charAt(i) == s.charAt(j)) pi.set(i, ++j);
        }
        return pi;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str, target;
        str = br.readLine();
        target = br.readLine();
        Vector<Integer> matched = kmp(str, target);
        System.out.println(!matched.isEmpty() ? 1 : 0);
    }
}