//  링

import java.util.*;
import java.io.*;

public class Main {
    public static int getgcd(int a, int b) {
        if (b == 0) return a;
        if (a < b) return getgcd(b, a);
        else return getgcd(b, a % b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int up = 1, down = 1;
        for (int i = 1; i < n; i++) {
            up *= arr[i - 1]; down *= arr[i];
            int gcd = getgcd(up, down);
            up /= gcd; down /= gcd;
            sb.append(up).append('/').append(down).append("\n");
        }

        System.out.println(sb);
    }
}