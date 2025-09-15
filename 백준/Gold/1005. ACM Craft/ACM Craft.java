import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder out = new StringBuilder();
    public static ArrayList<ArrayList<Integer>> rules;
    public static int[] buildTimes, indegree, dp;
    public static int n, k, w;

    public static int topologySort() {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= n; i++)
            if (indegree[i] == 0) {
                queue.offerLast(i);
                dp[i] = buildTimes[i];
                // 시작하는 건물은 그냥 그 자체로 시간
            }

        while (!queue.isEmpty()) {
            int now = queue.pollFirst();

            for (int v : rules.get(now)) {
                indegree[v]--;
                dp[v] = Math.max(buildTimes[v] + dp[now], dp[v]);
                // 어떤 건물을 지으려면 그 이전의 모든 건물이 지어져야 함 (문제예시의 2,3 -> 4)
                // 그러려면 모든 경우에 대해서 가장 오래 걸리는 시간을 생각해야 함
                if (indegree[v] == 0)
                    queue.offerLast(v);
            }
        }

        return dp[w];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            buildTimes = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++)
                buildTimes[i] = Integer.parseInt(st.nextToken());

            rules = new ArrayList<>();
            for (int i = 0; i <= n; i++)
                rules.add(new ArrayList<>());

            dp = new int[n + 1];
            indegree = new int[n + 1];
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
                rules.get(start).add(end);
                indegree[end]++;
            }

            w = Integer.parseInt(br.readLine());
            out.append(topologySort()).append("\n");
        }

        System.out.print(out);
    }
}