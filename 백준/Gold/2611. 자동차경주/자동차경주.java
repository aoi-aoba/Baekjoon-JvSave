//  자동차경주

import java.util.*;
import java.io.*;

public class Main {
    static class Node {
        int v, w;
        public Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    static int n, m;
    static ArrayList<Node>[] graph;
    static int[] indeg, score, prev;
    static Deque<Integer> q = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine()); m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();
        indeg = new int[n + 1];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken()),
                    w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v, w));
            indeg[v]++;
        }
        solve();

        StringBuilder sb = new StringBuilder();
        int num = 1;
        while (true) {
            if (prev[num] == 1) {
                q.offerLast(1);
                break;
            }
            q.offerLast(prev[num]);
            num = prev[num];
        }
        while (!q.isEmpty()) sb.append(q.pollLast()).append(' ');
        sb.append("1 ");
        System.out.println(score[1]);
        System.out.println(sb);
    }

    static void solve() {
        score = new int[n + 1]; prev = new int[n + 1];
        q.offerLast(1);
        while (!q.isEmpty()) {
            int now = q.pollFirst();
            for (Node nxt : graph[now]) {
                int nxtw = score[now] + nxt.w;
                if (score[nxt.v] < nxtw) {
                    score[nxt.v] = nxtw;
                    prev[nxt.v] = now;
                }
                indeg[nxt.v]--;
                if (indeg[nxt.v] == 0 && nxt.v != 1) q.offerLast(nxt.v);
            }
        }
    }
}