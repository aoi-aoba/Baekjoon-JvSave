import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int N, result = Integer.MAX_VALUE;
    public static int[] list;
    public static boolean[] visited;
    public static int[][] costTable;

    public static void initArrays(int input) {
        N = input;
        list = new int[N];
        visited = new boolean[N];
        costTable = new int[N][N];
    }

    public static int checkCost() {
        int costSum = 0;
        for (int i = 0; i < N; i++) {
            int now = list[i], next = (i == N-1) ? list[0] : list[i+1];
            if (costTable[now][next] == 0) return -1;
            else costSum += costTable[now][next];
        }
        return costSum;
    }

    public static void tracker(int depth) {
        if (depth == N) {
            int temp = checkCost();
            result = (temp != -1) ? Math.min(temp, result) : result;
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list[depth] = i;
                tracker(depth + 1);
                list[depth] = 0;
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        initArrays(Integer.parseInt(br.readLine()));

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                costTable[i][j] = Integer.parseInt(st.nextToken());
        }

        tracker(0);
        System.out.println(result);
    }
}