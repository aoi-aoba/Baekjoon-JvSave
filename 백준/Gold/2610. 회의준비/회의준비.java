//  회의준비

import java.util.*;
import java.io.*;

public class Main {
    public static int INF = 1_000_000_009;

    public static int n, m;
    public static int[] nodeArr;
    public static int[][] graphMatrix;
    public static List<List<Integer>> graph = new ArrayList<>();

    public static void getInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        graphMatrix = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++)
                graphMatrix[i][j] = (i == j) ? 0 : INF;

        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b); graph.get(b).add(a);
            graphMatrix[a][b] = graphMatrix[b][a] = 1;
        }
    }

    public static int findComponents() {
        nodeArr = new int[n + 1];
        Arrays.fill(nodeArr, -1);
        int curSetNum = 0;

        for (int i = 1; i <= n; i++) {
            if (nodeArr[i] != -1) continue;

            curSetNum++;
            Queue<Integer> Q = new ArrayDeque<>();
            nodeArr[i] = curSetNum;
            Q.add(i);

            while (!Q.isEmpty()) {
                int cur = Q.poll();
                for (int node : graph.get(cur)) {
                    if (nodeArr[node] == -1) {
                        nodeArr[node] = curSetNum;
                        Q.add(node);
                    }
                }
            }
        }
        return curSetNum;
    }

    public static void findRepresent(int compNum) {
        int[] reps = new int[compNum + 1], repMax = new int[compNum + 1];
        Arrays.fill(reps, -1);

        for (int k = 1; k <= n; k++) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    if (a == b) continue;
                    graphMatrix[a][b] = Math.min(graphMatrix[a][b], graphMatrix[a][k] + graphMatrix[k][b]);
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            int group = nodeArr[i], val = 0;
            for (int j = 1; j <= n; j++) {
                if (nodeArr[j] == group && graphMatrix[i][j] != INF)
                    val = Math.max(val, graphMatrix[i][j]);
            }
            if (reps[group] == -1 || repMax[group] > val) {
                reps[group] = i;
                repMax[group] = val;
            }
        }

        Arrays.sort(reps, 1, compNum + 1);
        for (int i = 1; i <= compNum; i++)
            System.out.println(reps[i]);
    }

    public static void main(String[] args) throws IOException {
        getInput();
        int comps = findComponents();
        System.out.println(comps);
        findRepresent(comps);
    }
}