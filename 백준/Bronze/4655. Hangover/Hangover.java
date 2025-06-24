import java.io.*;

public class Main {
    public static int getCardCnt(double c) {
        double sum = 0.00;
        for (int i = 1; ; i++) {
            sum += (1 / (double) (i + 1));
            if (sum >= c) return i;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            double c = Double.parseDouble(br.readLine());
            if (c == 0.00) break;
            sb.append(getCardCnt(c)).append(" card(s)\n");
        }
        System.out.print(sb);
    }
}