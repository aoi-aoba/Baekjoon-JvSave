import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int head = 0, tail = N-1, numItems = 0;

        for(int i=0; i<N; i++) {
            String op = br.readLine();
            if(op.startsWith("push")) {
                st = new StringTokenizer(op);
                st.nextToken();
                if(op.contains("back")) {
                    tail = (tail == arr.length - 1) ? 0 : tail + 1;
                    arr[tail] = Integer.parseInt(st.nextToken());
                }
                else {
                    head = (head == 0) ? arr.length - 1 : head - 1;
                    arr[head] = Integer.parseInt(st.nextToken());
                }
                ++numItems;
            } else if(op.startsWith("pop")) {
                if(numItems == 0) res.append(-1).append("\n");
                else if(op.contains("back")) {
                    res.append(arr[tail]).append("\n");
                    tail = (tail == 0) ? arr.length - 1 : tail - 1;
                    --numItems;
                } else {
                    res.append(arr[head]).append("\n");
                    head = (head == arr.length - 1) ? 0 : head + 1;
                    --numItems;
                }
            } else if(op.startsWith("size")) res.append(numItems).append("\n");
            else if(op.startsWith("empty")) res.append(numItems == 0 ? 1 : 0).append("\n");
            else if(op.startsWith("front")) {
                if(numItems == 0) res.append(-1).append("\n");
                else res.append(arr[head]).append("\n");
            }
            else {
                if(numItems == 0) res.append(-1).append("\n");
                else res.append(arr[tail]).append("\n");
            }
        }
        System.out.print(res);
        br.close();
    }
}