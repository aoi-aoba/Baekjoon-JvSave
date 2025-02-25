import java.io.*;
import java.util.*;

public class Main {
    static int cnt, num, connections;
    static boolean[] visited;
    static List[] computers;

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(start);

        while(!queue.isEmpty()) {
            int now = queue.poll();
            if(!visited[now]) {
                cnt++;
                visited[now] = true;
                for(int i=0; i<computers[now].size(); i++) {
                    queue.add((int)computers[now].get(i));
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        connections = Integer.parseInt(br.readLine());
        visited = new boolean[num + 1];
        computers = new List[num + 1];
        cnt = 0;
        for(int i = 1; i < num + 1; i++) {
            computers[i] = new ArrayList<Integer>();
        }

        StringTokenizer st;
        for(int i=0; i<connections; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            computers[a].add(b);
            computers[b].add(a);
        }

        bfs(1);
        System.out.println(cnt-1);
        br.close();
    }
}