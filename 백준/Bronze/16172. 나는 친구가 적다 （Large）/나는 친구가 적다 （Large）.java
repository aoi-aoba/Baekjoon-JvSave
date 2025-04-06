import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Vector;

public class Main {
    public static Vector<Integer> getPi(String str) {
        int len = str.length(), j = 0;
        Vector<Integer> piVector = new Vector<>();
        piVector.setSize(len);
        Collections.fill(piVector, 0);
        for (int i = 1; i < len; i++) {
            while (j > 0 && str.charAt(i) != str.charAt(j)) j = piVector.get(j - 1);
            if (str.charAt(i) == str.charAt(j)) piVector.set(i, ++j);
        }
        return piVector;
    }

    public static Vector<Integer> kmp(String main, String sub) {
        Vector<Integer> result = new Vector<>();
        Vector<Integer> piVector = getPi(sub);
        int len = main.length(), subLen = sub.length(), j = 0;
        for (int i = 0; i < len; i++) {
            while (j > 0 && main.charAt(i) != sub.charAt(j)) j = piVector.get(j - 1);
            if (main.charAt(i) == sub.charAt(j)) {
                if (j == subLen - 1) {
                    result.add(i - subLen + 1);
                    j = piVector.get(j);
                } else j++;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(), targetStr = br.readLine();
        str = str.replaceAll("[0-9]", "");
        boolean isExist = !kmp(str, targetStr).isEmpty();
        System.out.println(isExist ? 1 : 0);
        br.close();
    }
}