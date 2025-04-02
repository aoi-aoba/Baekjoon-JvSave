import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), W = Integer.parseInt(st.nextToken()),
                L = Integer.parseInt(st.nextToken()), nowWeight = 0, time = 0, truck_num = 0;

        int[] trucks = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) trucks[i] = Integer.parseInt(st.nextToken());

        Queue<Integer> bridge = new LinkedList<>();
        for(int i = 0; i < W; i++) bridge.add(0);

        while(!bridge.isEmpty()){
            time++;
            nowWeight -= bridge.poll();
            if(truck_num == N) continue;
            int next = (nowWeight + trucks[truck_num] > L) ? 0 : trucks[truck_num++];
            bridge.offer(next);
            nowWeight += next;
        }

        System.out.println(time);
        br.close();
    }
}