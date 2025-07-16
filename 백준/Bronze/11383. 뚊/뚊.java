import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

        char[][] arr = new char[a][b];
        for (int i = 0; i < a; i++) {
            String str = br.readLine();
            for (int j = 0; j < b; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        boolean isLarge = true;
        for (int i = 0; i < a; i++) {
            String str = br.readLine();
            for (int j = 0; j < 2 * b; j += 2) {
                if (arr[i][j / 2] != str.charAt(j) || arr[i][j / 2] != str.charAt(j + 1)) {
                    isLarge = false;
                    break;
                }
            }
            if (!isLarge) break;
        }

        out.append(isLarge ? "Eyfa\n" : "Not Eyfa\n");

        bw.write(out.toString());
        bw.flush();
    }
}