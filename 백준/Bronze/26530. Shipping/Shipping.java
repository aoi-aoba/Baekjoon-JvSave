import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            int T = Integer.parseInt(br.readLine());
            double res = 0;
            for(int j=0; j<T; j++) {
                st = new StringTokenizer(br.readLine());
                String product = st.nextToken();
                int val = Integer.parseInt(st.nextToken());
                double price = Double.parseDouble(st.nextToken());
                res += (double)val * price;
            }
            sb.append("$").append(String.format("%.2f", res)).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}