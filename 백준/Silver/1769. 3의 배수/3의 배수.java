import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String change(String str) {
        long res = 0;
        char[] strArr = str.toCharArray();
        for (char ch : strArr) res += (ch - '0');
        return String.valueOf(res);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        while (true) {
            if (str.length() == 1) break;
            else {
                cnt++;
                str = change(str);
            }
        }
        System.out.println(cnt);
        System.out.println(Integer.parseInt(str) % 3 == 0 ? "YES" : "NO");
        br.close();
    }
}