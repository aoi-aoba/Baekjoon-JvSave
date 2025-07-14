import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        double result = 0;
        if (M <= 30) result = M / 2.0;
        else result = 15 + (M - 30) / 2.0 * 3.0;

        bw.write(String.valueOf(result));
        bw.flush();
    }
}