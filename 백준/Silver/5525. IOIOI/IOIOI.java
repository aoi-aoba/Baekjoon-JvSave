import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), M = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int cnt = 0, pattern = 0;
        for (int i = 1; i < M - 1; i++) {
            if (str.charAt(i - 1) == 'I' && str.charAt(i) == 'O' && str.charAt(i + 1) == 'I') {
                pattern++;
                i++;

                if (pattern == N) {
                    cnt++;
                    pattern--;
                }
            } else pattern = 0;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}