import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int N, M;
    public static ArrayList<Integer> numList = new ArrayList<>();
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
        for (int temp : numList) {
            if (!visited[temp]) {
                visited[temp] = true;
                list.add(temp);
                find(list, depth + 1);
                list.remove(list.size() - 1);
                visited[temp] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) numList.add(Integer.parseInt(st.nextToken()));
        Collections.sort(numList);

        ArrayList<Integer> list = new ArrayList<>();
        visited = new boolean[10001];

        find(list, 0);
        System.out.print(result);
    }
}
