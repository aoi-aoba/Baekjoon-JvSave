import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();
        int P = Integer.parseInt(br.readLine());
        while (P-- > 0) {
            String quote = br.readLine(), rule = br.readLine();
            for (int i = 0; i < quote.length(); i++) {
                if (quote.charAt(i) == ' ') out.append(" ");
                else out.append(rule.charAt(quote.charAt(i) - 'A'));
            }
            out.append("\n");
        }
        bw.write(out.toString());
        bw.flush();
    }
}