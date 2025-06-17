import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int N, result = 0;
    public static int[] target, list;
    public static boolean[] visited;

    public static void tracker(int depth) {
        if (depth == N) {
            int tempSum = 0;
            for (int i = 0; i < N - 1; i++)
                tempSum += Math.abs(list[i] - list[i + 1]);
            result = Math.max(result, tempSum);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list[depth] = target[i];
                tracker(depth + 1);
                list[depth] = 0;
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        target = new int[N];
        list = new int[N];
        visited = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) target[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(target);

        tracker(0);
        System.out.println(result);
    }
}