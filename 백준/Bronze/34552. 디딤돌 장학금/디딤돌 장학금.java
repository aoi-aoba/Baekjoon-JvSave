//  디딤돌 장학금

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();
        int n, b, s, tot = 0;
        double l;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 11; i++) list.add(Integer.parseInt(st.nextToken()));
        n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            b = Integer.parseInt(st.nextToken());
            l = Double.parseDouble(st.nextToken());
            s = Integer.parseInt(st.nextToken());
            if (l >= 2.0 && s >= 17) tot += list.get(b);
        }
        System.out.println(tot);
    }
}