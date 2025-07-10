import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            double milk = Double.parseDouble(st.nextToken()) / 8.0, egg = Double.parseDouble(st.nextToken()) / 8.0,
                    sugar = Double.parseDouble(st.nextToken()) / 4.0, salt = Double.parseDouble(st.nextToken()),
                    flour = Double.parseDouble(st.nextToken()) / 9.0;

            int cake = Integer.MAX_VALUE;
            cake = Math.min(cake, (int)(16 * milk));
            cake = Math.min(cake, (int)(16 * egg));
            cake = Math.min(cake, (int)(16 * sugar));
            cake = Math.min(cake, (int)(16 * salt));
            cake = Math.min(cake, (int)(16 * flour));

            st = new StringTokenizer(br.readLine());
            int banana = Integer.parseInt(st.nextToken()), straw = Integer.parseInt(st.nextToken()) / 30,
                    choco = Integer.parseInt(st.nextToken()) / 25, walnut = Integer.parseInt(st.nextToken()) / 10,
                    sum = banana + straw + choco + walnut;
            out.append(Math.min(sum, cake)).append("\n");
        }

        bw.write(out.toString());
        bw.flush();
    }
}