import java.io.*;
import java.util.*;

public class Main {
    public static PriorityQueue<Integer> maxHeap;
    public static PriorityQueue<Integer> minHeap;

    public static void addNum(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) maxHeap.offer(num);
        else minHeap.offer(num);
        if (maxHeap.size() > minHeap.size() + 1) minHeap.offer(maxHeap.poll());
        else if (minHeap.size() > maxHeap.size()) maxHeap.offer(minHeap.poll());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            minHeap = new PriorityQueue<>();

            for (int i = 1; i <= N; i++) {
                addNum(Integer.parseInt(st.nextToken()));
                if (i % 2 == 1) list.add(maxHeap.peek());
                if (i % 10 == 0) st = new StringTokenizer(br.readLine());
            }

            sb.append(list.size()).append("\n");
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i)).append(" ");
                if (i % 10 == 9) sb.append("\n");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}