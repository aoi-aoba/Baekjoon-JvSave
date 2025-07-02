import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double hud = 9.23076 * Math.pow((26.7 - Double.parseDouble(st.nextToken())), 1.835);
            double nop = 1.84523 * Math.pow((Double.parseDouble(st.nextToken()) - 75), 1.348);
            double poh = 56.0211 * Math.pow((Double.parseDouble(st.nextToken()) - 1.5), 1.05);
            double run = 4.99087 * Math.pow((42.5 - Double.parseDouble(st.nextToken())), 1.81);
            double mul = 0.188807 * Math.pow((Double.parseDouble(st.nextToken()) - 210), 1.41);
            double cha = 15.9803 * Math.pow((Double.parseDouble(st.nextToken()) - 3.8), 1.04);
            double pal = 0.11193 * Math.pow((254 - Double.parseDouble(st.nextToken())), 1.88);
            int sum = (int) hud + (int) nop + (int) poh + (int) run + (int) mul + (int) cha + (int) pal;
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}