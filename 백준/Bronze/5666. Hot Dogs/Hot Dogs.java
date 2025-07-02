import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if (str == null) break;
            StringTokenizer st = new StringTokenizer(str);
            double H = Double.parseDouble(st.nextToken()), P = Double.parseDouble(st.nextToken());
            sb.append(String.format("%.2f\n", H / P));
        }
        System.out.print(sb);
        br.close();
    }
}