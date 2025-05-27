import java.io.*;
import java.util.*;

public class Main {
    public static int N, result = Integer.MAX_VALUE;
    public static ArrayList<Integer> teamA = new ArrayList<>();
    public static boolean[] visited;
    public static int[][] statTable;

    public static void checkStat() {
        int statSumA = 0, statSumB = 0;

        // 팀 A 능력치 계산
        for (int i = 0; i < N / 2; i++) {
            for (int j = i + 1; j < N / 2; j++) {
                int p1 = teamA.get(i);
                int p2 = teamA.get(j);
                statSumA += statTable[p1][p2] + statTable[p2][p1];
            }
        }

        // 팀 B 능력치 계산 (visited 배열로 판단)
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (!visited[i] && !visited[j]) {
                    statSumB += statTable[i][j] + statTable[j][i];
                }
            }
        }

        result = Math.min(result, Math.abs(statSumA - statSumB));
    }

    public static void tracker(int depth, int prev) {
        if (result == 0) return;
        if (depth == N / 2) {
            checkStat();
            return;
        }

        for (int i = prev; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                teamA.add(i);
                tracker(depth + 1, i + 1);
                teamA.remove(teamA.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N];
        statTable = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                statTable[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        tracker(0, 0);
        System.out.println(result);
        br.close();
    }
}
