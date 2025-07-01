import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            int heads = Integer.parseInt(br.readLine());
            String orders = br.readLine();
            for (int j = 0; j < orders.length(); j++) {
                if (orders.charAt(j) == 'c') heads++;
                else heads--;
            }
            sb.append("Data Set ").append(i).append(":\n").append(heads).append("\n\n");
        }
        System.out.print(sb);
        br.close();
    }
}