//  소수 경로

import java.util.*;
import java.io.*;

public class Main {
    public static boolean[] isPrime = new boolean[10000];

    public static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= 100; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < 10000; j += i)
                isPrime[j] = false;
        }
    }

    public static int bfs(int start, int end) {
        if (start == end) return 0;

        Queue<Integer> Q = new ArrayDeque<>();
        boolean[] visited = new boolean[10000];
        int[] step = new int[10000];

        Q.add(start);
        visited[start] = true;

        while (!Q.isEmpty()) {
            int cur = Q.poll();
            if (cur == end) return step[cur];

            int[] d = {
                    cur / 1000,
                    (cur / 100) % 10,
                    (cur / 10) % 10,
                    cur % 10
            };

            for (int i = 0; i < 4; i++) {
                int original = d[i];
                for (int j = 0; j <= 9; j++) {
                    if (i == 0 && j == 0) continue;
                    if (j == original) continue;

                    d[i] = j;
                    int next =
                            d[0] * 1000 + d[1] * 100 + d[2] * 10 + d[3];

                    if (isPrime[next] && !visited[next]) {
                        visited[next] = true;
                        step[next] = step[cur] + 1;
                        Q.offer(next);
                    }
                }
                d[i] = original;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sieve();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            int result = bfs(a, b);
            System.out.println(result != -1 ? result : "IMPOSSIBLE");
        }
    }
}