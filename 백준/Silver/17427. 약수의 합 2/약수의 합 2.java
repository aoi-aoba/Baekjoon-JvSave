import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int MAX = 1_000_000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] f = new long[N + 1];  // f[i] = i의 약수의 합

        // 약수의 합 구하기: 에라토스테네스의 체처럼 처리
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                f[j] += i;
            }
        }

        // g(N) = f(1) + f(2) + ... + f(N)
        long g = 0;
        for (int i = 1; i <= N; i++) {
            g += f[i];
        }

        System.out.println(g);
    }
}