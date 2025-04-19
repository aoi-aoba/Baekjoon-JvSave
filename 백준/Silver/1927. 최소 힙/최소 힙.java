import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> heap = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int temp = Integer.parseInt(br.readLine()), peak = 0;
            if (temp == 0 && !heap.isEmpty()) peak = heap.poll();
            else if (temp != 0) heap.add(temp);
            if (temp == 0) sb.append(peak).append("\n");
        }
        System.out.print(sb);
    }
}