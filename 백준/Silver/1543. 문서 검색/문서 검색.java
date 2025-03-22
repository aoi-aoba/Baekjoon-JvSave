import java.util.*;
import java.io.*;

public class Main {
    public static Vector<Integer> getPi(String s) {
        int N = s.length(), j = 0;
        Vector<Integer> pi = new Vector<>();
        pi.setSize(N);
        Collections.fill(pi, 0);
        for (int i = 1; i < N; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) j = pi.get(j - 1);
            if(s.charAt(i) == s.charAt(j)) pi.set(i, ++j);
        }
        return pi;
    }
    public static Vector<Integer> kmp(String s, String p) {
        Vector<Integer> answer = new Vector<>();
        Vector<Integer> pi = getPi(p);
        int N = s.length(), M = p.length(), j = 0;
        for(int i = 0; i < N; i++) {
            while (j > 0 && s.charAt(i) != p.charAt(j)) j = pi.get(j - 1);
            if(s.charAt(i) == p.charAt(j)) {
                if(j == M - 1) {
                    answer.add(i - M + 1);
                    j = pi.get(j);
                } else j++;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(), subStr = br.readLine();
        Vector<Integer> kmp = kmp(str, subStr);

        int res = 0;
        if(!kmp.isEmpty()) {
            res = 1;
            int beforeEnd = kmp.get(0) + subStr.length() - 1;
            for(int i=1; i<kmp.size(); i++) {
                if(beforeEnd < kmp.get(i)) {
                    res++;
                    beforeEnd = kmp.get(i) + subStr.length() - 1;
                }
            }
        }

        System.out.println(res);
    }
}