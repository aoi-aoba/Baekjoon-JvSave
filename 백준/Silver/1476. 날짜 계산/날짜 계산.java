import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // 주어지는 값이 a, b, c일 때 일반해 N에 대하여 N = a (mod 15), N = b (mod 28), N = c (mod 19)

        int e = 13; // 28 * 19 * e = 532 = 7 (mod 15), 7e mod 15 = 1이면 e는 최소일 때 13
        int s = 17; // 15 * 19 * s = 285 = 5 (mod 28), 5s mod 28 = 1이면 s는 최소일 때 17
        int m = 10; // 15 * 28 * m = 420 = 2 (mod 19), 2m mod 19 = 1이면 m은 최소일 때 10

        int res = (28 * 19 * e * E + 15 * 19 * s * S + 15 * 28 * m * M) % 7980;
        if(res == 0) res = 7980;
        System.out.println(res);
    }
}