import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Integer> primeList = new ArrayList<>();
    public static void sieve(int N) {
        boolean[] notPrime = new boolean[N + 1];
        notPrime[0] = notPrime[1] = true;
        for (int i = 2; i * i <= N; i++)
            if (!notPrime[i])
                for (int j = i * i; j <= N; j += i)
                    notPrime[j] = true;
        for (int i = 2; i <= N; i++)
            if (!notPrime[i]) primeList.add(i);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), res = 0;
        sieve(N);

        int left = 0, right = 0, sum = 0;
        while (true) {
            if (sum >= N) {
                if (sum == N) res++;
                sum -= primeList.get(left++);
            } else {
                if (right == primeList.size()) break;
                sum += primeList.get(right++);
            }
        }

        System.out.println(res);
    }
}