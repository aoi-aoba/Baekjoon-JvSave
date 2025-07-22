import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();

        String str = br.readLine();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char find = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
            String target = str.substring(start, end + 1);

            int cnt = 0;
            for (int j = 0; j < target.length(); j++)
                if (target.charAt(j) == find) cnt++;
            result.append(cnt).append("\n");
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}