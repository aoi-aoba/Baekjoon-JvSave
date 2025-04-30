import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static String times(String a, String b) {
        StringBuilder result = new StringBuilder();
        StringBuilder revA = new StringBuilder(a).reverse(), revB = new StringBuilder(b).reverse();
        int i = 0;
        for (; i < Math.min(revA.length(), revB.length()); i++) {
            StringBuilder temp = new StringBuilder(String.valueOf((revA.charAt(i) - '0') * (revB.charAt(i) - '0')));
            result.append(temp.reverse());
        }
        if (revA.length() > revB.length()) {
            for (; i < revA.length(); i++)
                result.append(revA.charAt(i));
        } else {
            for (; i < revB.length(); i++)
                result.append(revB.charAt(i));
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken(), b = st.nextToken();
            long value = Long.parseLong(times(a, b));
            long temp = Long.parseLong(a) * Long.parseLong(b);
            sb.append(temp == value ? 1 : 0).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}