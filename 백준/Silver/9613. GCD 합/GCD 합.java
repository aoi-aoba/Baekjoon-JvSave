//  GCD 합

import java.util.*;
import java.io.*;

public class Main {
    public static long t, n;
    public static long getGCD(long a, long b) {
        if (b == 0) return a;
        else if (a < b) return getGCD(b, a);
        else return getGCD(b, a % b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Long.parseLong(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Long.parseLong(st.nextToken());
            ArrayList<Long> numlist = new ArrayList<>();
            for (int i = 0; i < n; i++) numlist.add(Long.parseLong(st.nextToken()));
            if (n == 1) System.out.println(numlist.get(0));
            else {
                long gcdSum = 0;
                for (int i = 0; i < n; i++)
                    for (int j = 0; j < i; j++)
                        gcdSum += getGCD(numlist.get(i), numlist.get(j));
                System.out.println(gcdSum);
            }
        }
    }
}