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
                L = Integer.parseInt(st.nextToken()), nowWeight = 0, time = 0;

        Queue<Integer> queue = new LinkedList<>();
        Queue<int[]> bridge = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) queue.add(Integer.parseInt(st.nextToken()));
        boolean isFullOfMaxCar = false;

        while(!(queue.isEmpty() && bridge.isEmpty())) {
            if (!bridge.isEmpty()) {
                bridge.forEach(car -> car[1]++);
                while (bridge.peek() != null) {
                    if (bridge.peek()[1] == W) nowWeight -= bridge.remove()[0];
                    else break;
                }
            }
            if (!queue.isEmpty()) {
                if (queue.peek() + nowWeight <= L) {
                    int[] car = {queue.remove(), 0};
                    nowWeight += car[0];
                    bridge.add(car);
                }
            }
            time += 1;
        }

        System.out.println(time);
        br.close();
    }
}
