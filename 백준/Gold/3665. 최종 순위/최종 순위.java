import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder out = new StringBuilder();
    public static ArrayList<boolean[]> graph;
    public static int[] indegree;
    public static int n, m;

    public static void topologySort() {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= n; i++)
            if (indegree[i] == 0)
                queue.offerLast(i);

        while (!queue.isEmpty()) {
            int now = queue.pollFirst();
            result.add(now);

            for (int i = 1; i <= n; i++) {
                if (!graph.get(now)[i]) {
                    // 여기서는 false 값이 상회하지 않는다는 것이므로 해당 배열에 접근해서 상회조건 제거 가능
                    graph.get(i)[now] = false;
                    indegree[i]--;
                }
                if (indegree[i] == 0)
                    queue.offerLast(i);
            }
        }

        if (result.size() != n) {
            out.append("IMPOSSIBLE\n");
            return;
        }

        for (int v : result)
            out.append(v).append(" ");
        out.append("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            int[] lRank = new int[n];
            indegree = new int[n + 1];
            graph = new ArrayList<>();
            for (int i = 0; i < n + 1; i++)
                graph.add(new boolean[n+1]);

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) lRank[i] = Integer.parseInt(st.nextToken());

            for (int i = 1; i < n; i++)
                for (int j = 0; j < i; j++) {
                    graph.get(lRank[i])[lRank[j]] = true;
                    indegree[lRank[i]]++;
                }
            // 해당 팀보다 등수가 상회하는 팀에 대해서는 배열 인덱스에 맞춰 true

            m = Integer.parseInt(br.readLine());

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int aTeam = Integer.parseInt(st.nextToken()), bTeam = Integer.parseInt(st.nextToken());

                // 주어진 두 팀이 어디가 상회했는지 확인 후 상회조건 변경 및 상회개수 조정
                if (graph.get(aTeam)[bTeam]) {
                    graph.get(aTeam)[bTeam] = false;
                    graph.get(bTeam)[aTeam] = true;
                    indegree[aTeam]--;
                    indegree[bTeam]++;
                } else if (graph.get(bTeam)[aTeam]) {
                    graph.get(bTeam)[aTeam] = false;
                    graph.get(aTeam)[bTeam] = true;
                    indegree[bTeam]--;
                    indegree[aTeam]++;
                }
            }

            topologySort();
        }

        System.out.print(out);
    }
}