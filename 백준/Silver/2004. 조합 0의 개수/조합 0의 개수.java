//  조합 0의 개수

import java.util.*;
import java.io.*;

public class Main {
    public static int calcCombi(int n, int r) {
        int res = 0;
        while (n > 0) {
            res += n / r;
            n /= r;
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int twos = calcCombi(n, 2) - calcCombi(m, 2) - calcCombi(n - m, 2);
        int fives = calcCombi(n, 5) - calcCombi(m, 5) - calcCombi(n - m, 5);
        System.out.println(twos < fives ? twos : fives);
    }
}