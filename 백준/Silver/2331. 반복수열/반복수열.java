//  반복수열

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
        int[] d = new int[1_000_000];
        boolean[] check = new boolean[1_000_000];

        d[1] = a;
        check[a] = true;
        int i = 2, t = 0;
        String str = "";

        while (true) {
            t = 0;
            str = d[i - 1] + "";
            for (int j = 0; j < str.length(); j++)
                t += (Math.pow((str.charAt(j) - 48), p));
            d[i++] = t;

            if (check[t]) break;
            check[t] = true;
        }

        int cnt = 0, j = 1;
        while (d[j] != (int)t) {
            j++; cnt++;
        }

        System.out.println(cnt);
    }
}