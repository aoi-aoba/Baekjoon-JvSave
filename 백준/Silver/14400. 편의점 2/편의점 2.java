//  편의점 2

import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static long res = 0;
    public static int[] xpos, ypos;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        xpos = new int[n]; ypos = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            xpos[i] = x; ypos[i] = y;
        }

        Arrays.sort(xpos);
        Arrays.sort(ypos);

        for (int i = 0; i < n; i++) {
            res += Math.abs(xpos[i] - xpos[i / 2]);
            res += Math.abs(ypos[i] - ypos[i / 2]);
        }
        System.out.println(res);

    }
}