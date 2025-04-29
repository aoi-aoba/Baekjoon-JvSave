import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] Fibo;
    public static int getFibo(int N) {
        if (N == 0 || N == 1) return N;
        Fibo = new int[N+1];
        Fibo[0] = 0; Fibo[1] = 1;
        for (int i = 2; i <= N; i++) {
            long temp = Fibo[i - 1] + Fibo[i - 2];
            Fibo[i] = (int) (temp % 1000000000L);
        }
        return Fibo[N];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), res = 0;
        if (N < 0)  {
            if (((-1) * N) % 2 == 0) System.out.println(-1);
            else System.out.println(1);
            System.out.println(getFibo((-1)*N));
        } else {
            System.out.println(Integer.compare(N, 0));
            System.out.println(getFibo(N));
        }
        br.close();
    }
}