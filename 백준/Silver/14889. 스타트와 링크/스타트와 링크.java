import java.io.*;
import java.util.*;

public class Main {
    public static int N, result = Integer.MAX_VALUE;
    public static ArrayList<Integer> teamA = new ArrayList<>();
    public static boolean[] visited;
    public static int[][] statTable;
    public static void checkStat() {
        int statSumA = 0, statSumB = 0;
        for (int i = 0; i < N/2; i++)
            for (int j = i + 1; j < N/2; j++) {
                statSumA += statTable[teamA.get(i)][teamA.get(j)];
                statSumA += statTable[teamA.get(j)][teamA.get(i)];
            }
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (!teamA.contains(i) && !teamA.contains(j))  {
                    statSumB += statTable[i][j];
                    statSumB += statTable[j][i];
                }
        result = Math.min(Math.abs(statSumA-statSumB), result);
    }
    public static void tracker(int depth, int prev) {
        if (depth == N/2) {
            checkStat();
            return;
        }
        if (result == 0) return;
        for (int i = prev; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                teamA.add(i);
                tracker(depth+1, i+1);
                teamA.remove(teamA.size()-1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        statTable = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                statTable[i][j] = Integer.parseInt(st.nextToken());
        }

        tracker(0, 0);
        System.out.println(result);
        br.close();
    }
}
