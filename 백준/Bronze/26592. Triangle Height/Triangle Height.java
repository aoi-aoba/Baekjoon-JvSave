import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            double area = Double.parseDouble(st.nextToken());
            double base = Double.parseDouble(st.nextToken());
            double height = 2 * area / base;
            sb.append("The height of the triangle is ").append(String.format("%.2f", height)).append(" units").append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}