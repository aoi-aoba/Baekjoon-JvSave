import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Vector;

public class Main {
    public static Vector<Integer> getPiVector(String s) {
        int l = s.length(), j = 0;
        Vector<Integer> result = new Vector<>();
        result.setSize(l);
        Collections.fill(result, 0);
        for (int i = 1; i < l; i++) {
            while(j > 0 && s.charAt(i) != s.charAt(j)) j = result.get(j-1);
            if(s.charAt(i) == s.charAt(j)) result.set(i, ++j);
        }
        return result;
    }
    public static Vector<Integer> kmp(String s, String t) {
        int l = s.length(), m = t.length(), j = 0;
        Vector<Integer> result = new Vector<>();
        Vector<Integer> pi = getPiVector(t);
        for (int i = 0; i < l; i++) {
            while(j > 0 && s.charAt(i) != t.charAt(j)) j = pi.get(j-1);
            if(s.charAt(i) == t.charAt(j)) {
                if(j == m - 1) {
                    result.add(i - m + 1);
                    j = pi.get(j);
                } else j++;
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while (true) {
            str = br.readLine();
            if(str.equals("EOI")) break;
            sb.append(kmp(str.toLowerCase(), "nemo").isEmpty() ? "Missing" : "Found").append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}