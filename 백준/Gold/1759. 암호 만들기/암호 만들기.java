import java.io.*;
import java.util.*;

public class Main {
    public static char[] chars;
    public static int L, C;
    public static StringBuilder result = new StringBuilder();
    public static void checkPrinting(String target) {
        char[] targetArr = target.toCharArray();
        int vowels = 0, consonants = 0;
        for (char ch : targetArr) {
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') vowels++;
            else consonants++;
        }
        if (vowels >= 1 && consonants >= 2) result.append(target).append("\n");
    }
    public static void tracker(int depth, int prev, String nowString) {
        if (depth == L) {
            checkPrinting(nowString);
            return;
        } else for (int i = prev; i < C; i++) {
            tracker(depth+1, i+1,nowString+chars[i]);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        chars = new char[C];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) chars[i] = st.nextToken().charAt(0);
        Arrays.sort(chars);
        tracker(0, 0, "");
        System.out.print(result);
        br.close();
    }
}