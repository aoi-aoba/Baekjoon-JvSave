import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3], y = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int px = Integer.parseInt(st.nextToken()), py = Integer.parseInt(st.nextToken());
            x[i] = px;
            y[i] = py;
        }

        int cp = (x[1] - x[0]) * (y[2] - y[1]) - (y[1] - y[0]) * (x[2] - x[1]);
        System.out.println(Integer.compare(cp, 0));
    }
}