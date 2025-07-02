import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()),
                s = Integer.parseInt(st.nextToken()), T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            if (str.charAt(0) == '1') {
                st = new StringTokenizer(str);
                st.nextToken();
                int add = Integer.parseInt(st.nextToken());
                s += add;
                m += (s / 60);
                s %= 60;
                h += (m / 60);
                m %= 60;
                h %= 24;
            } else if (str.charAt(0) == '2') {
                st = new StringTokenizer(str);
                st.nextToken();
                int minus = Integer.parseInt(st.nextToken());
                h -= minus / 3600;
                m -= minus % 3600 / 60;
                s -= minus % 3600 % 60;
                while (s < 0) {
                    m--;
                    s += 60;
                }
                while (m < 0) {
                    h--;
                    m += 60;
                }
                while (h < 0) {
                    h += 24;
                }
            } else output.append(h).append(" ").append(m).append(" ").append(s).append("\n");
        }
        System.out.print(output);
    }
}