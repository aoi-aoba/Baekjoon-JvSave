import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            double temp = Integer.parseInt(br.readLine());
            sb.append(Math.sqrt(temp) == (int) Math.sqrt(temp) ? "1\n" : "0\n");
        }
        System.out.print(sb);
    }
}