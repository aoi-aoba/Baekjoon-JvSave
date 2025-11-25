//  핑크빈 레이드

import java.util.*;
import java.io.*;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cu = Integer.parseInt(st.nextToken()), du = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int cd = Integer.parseInt(st.nextToken()), dd = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int cp = Integer.parseInt(st.nextToken()), dp = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(br.readLine());

        int g = gcd(cu, gcd(cd, cp)), t = 0;
        h -= du + dd + dp;
        while (h > 0) {
            t += g;
            if (t % cu == 0) h -= du;
            if (t % cd == 0) h -= dd;
            if (t % cp == 0) h -= dp;
        }

        System.out.println(t);

    }
}