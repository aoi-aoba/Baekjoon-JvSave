import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static int N, M;
    public static StringBuilder result = new StringBuilder();
    public static boolean[] visited;
    public static void find(ArrayList<Integer> list, int depth) {
        if (depth == M) {
            for (int temp : list) {
                result.append(temp).append(" ");
            }
            result.append("\n");
            return;
        }
        for (int i = 1; i <= N; i++) {
            visited[i] = true;
            list.add(i);
            find(list, depth + 1);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        visited = new boolean[N+1];

        find(list, 0);
        System.out.print(result);
    }
}
