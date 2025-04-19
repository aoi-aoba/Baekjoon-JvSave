import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        while (N-- > 0) {
            int temp = Integer.parseInt(br.readLine());
            if (temp > 0) MaxHeap.add(temp);
            else if (temp == 0 && MaxHeap.isEmpty()) sb.append(0).append("\n");
            else sb.append(MaxHeap.poll()).append("\n");
        }
        System.out.print(sb);
    }
}
