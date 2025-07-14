import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), yMin = Integer.MAX_VALUE, yMax = Integer.MIN_VALUE;
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            int y = Integer.parseInt(st.nextToken());
            yMax = Math.max(yMax, y);
            yMin = Math.min(yMin, y);
        }

        bw.write(String.valueOf(yMax - yMin));
        bw.flush();
    }
}