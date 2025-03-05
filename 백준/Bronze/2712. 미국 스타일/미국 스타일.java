import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double n = Double.parseDouble(st.nextToken());
            String str = st.nextToken();
            switch (str) {
                case "kg" -> sb.append(String.format("%.4f", n * 2.2046)).append(" lb");
                case "lb" -> sb.append(String.format("%.4f", n * 0.4536)).append(" kg");
                case "l" -> sb.append(String.format("%.4f", n * 0.2642)).append(" g");
                case "g" -> sb.append(String.format("%.4f", n * 3.7854)).append(" l");
            }
            sb.append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}