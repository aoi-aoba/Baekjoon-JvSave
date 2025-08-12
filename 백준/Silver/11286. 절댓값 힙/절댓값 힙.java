import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heapNor = new PriorityQueue<>();
        PriorityQueue<Integer> heapRev = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp < 0) heapRev.add(temp);
            else if (temp > 0) heapNor.add(temp);
            else {
                if (heapNor.isEmpty() && heapRev.isEmpty()) bw.write("0\n");
                else if (heapNor.isEmpty()) {
                    bw.write(String.valueOf(heapRev.poll()) + "\n");
                } else if (heapRev.isEmpty()) {
                    bw.write(String.valueOf(heapNor.poll()) + "\n");
                } else {
                    if (heapNor.peek() >= heapRev.peek() * (-1))
                        bw.write(String.valueOf(heapRev.poll()) + "\n");
                    else bw.write(String.valueOf(heapNor.poll()) + "\n");
                }
            }
        }

        bw.flush();
    }
}