import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();

        String str = br.readLine();
        int T = Integer.parseInt(br.readLine());

        int[][] alphaArr = new int[str.length()][26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0) {
                alphaArr[0][ch - 'a']++;
                continue;
            }
            for (int j = 0; j < 26; j++) {
                if (ch - 'a' == j) alphaArr[i][j] = alphaArr[i-1][j] + 1;
                else alphaArr[i][j] = alphaArr[i-1][j];
            }
        }

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char find = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
            result.append(alphaArr[end][find-'a'] - (start != 0 ? alphaArr[start - 1][find-'a'] : 0)).append("\n");
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}