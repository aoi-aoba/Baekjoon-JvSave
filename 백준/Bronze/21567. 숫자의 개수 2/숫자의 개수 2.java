//  숫자의 개수 2

import java.util.*;
import java.io.*;

public class Main {
    public static int[] res = new int[10];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Integer.parseInt(br.readLine());
        long b = Integer.parseInt(br.readLine());
        long c = Integer.parseInt(br.readLine());

        long times = a * b * c;
        while (times > 0) {
            int n = (int)(times % 10L);
            res[n]++;
            times /= 10;
        }

        for (int temp : res) System.out.println(temp);
    }
}