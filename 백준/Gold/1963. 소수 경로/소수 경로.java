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
            if (step[end] > 0) return step[end];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == 0 && j == 0) continue;

                    StringBuilder sb = new StringBuilder(String.format("%04d", cur));
                    sb.setCharAt(i, (char)(j + '0'));

                    int target = Integer.parseInt(sb.toString());
                    if (isPrime[target] && !visited[target]) {
                        visited[target] = true;
                        step[target] = step[cur] + 1;
                        Q.offer(target);
                    }
                }
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