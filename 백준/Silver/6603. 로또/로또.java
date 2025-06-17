import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static int N;
    public static int[] target, list;
    public static boolean[] visited;
    public static StringBuilder result = new StringBuilder();

    public static void tracker(int depth, int prev) {
        if (depth == 6) {
            for (int temp : list) result.append(temp).append(" ");
            result.append("\n");
            return;
        }
        for (int i = prev; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list[depth] = target[i];
                tracker(depth + 1, i + 1);
                visited[i] = false;
                list[depth] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            if (N == 0) break;
            list = new int[6];
            target = new int[N];
            visited = new boolean[N];
            for (int i = 0; i < N; i++) target[i] = Integer.parseInt(st.nextToken());
            tracker(0, 0);
            result.append("\n");
        }
        System.out.print(result);
    }
}