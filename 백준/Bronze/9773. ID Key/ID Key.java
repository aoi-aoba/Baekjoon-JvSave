import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String strNum = br.readLine();
            int sum = 0, finThree = 0;
            for (int j = 0; j < 13; j++) sum += strNum.charAt(j) - '0';
            finThree = Integer.parseInt(strNum.substring(10)) * 10;
            int idKey = sum + finThree;
            if (idKey > 10000) idKey %= 10000;
            else if (idKey < 1000) idKey += 1000;
            out.append(String.format("%04d", idKey)).append("\n");
        }

        bw.write(out.toString());
        bw.flush();
    }
}