import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());

        List<HashSet<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            HashSet<Integer> set = new HashSet<>();
            graph.add(set);
        }

        for (int x = 1; x <= 10; x++) {
            if (a == 0) { // by = c이므로 x와 무관하게 y = c / b가 정수면 추가
                double temp = c / (double) b;
                if ((int) temp == temp && temp <= 10 && temp >= 1)
                    graph.get(x).add((int) temp);
            } else if (b == 0) { // ax = c이므로 x = c / a일 때 1~10을 추가
                double temp = c / (double) a;
                if ((int) temp == temp && temp == x)
                    for (int y = 1; y <= 10; y++)
                        graph.get(x).add(y);
            } else {
                double temp = (c - a * x) / (double) b;
                if ((int) temp == temp && temp <= 10 && temp >= 1)
                    graph.get(x).add((int) temp);
                // ax+by=c, by=c-ax, y=(c-ax)/b
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (!graph.get(i).isEmpty()) {
                for (int temp : graph.get(i)) sb.append(temp).append(" ");
            } else sb.append("0");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}