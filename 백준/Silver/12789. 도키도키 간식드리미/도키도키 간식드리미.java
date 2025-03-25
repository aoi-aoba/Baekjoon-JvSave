import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), now = 1;
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> waiting = new Stack<>();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == now) now++;
            else waiting.push(arr[i]);
            if (!waiting.isEmpty()) {
                while (waiting.peek() == now) {
                    waiting.pop();
                    now++;
                    if (waiting.isEmpty()) break;
                }
            }
        }
        System.out.println(waiting.isEmpty() ? "Nice" : "Sad");
    }
}