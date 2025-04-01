import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Queue<Integer> queue = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine()), lastPushedInteger = 0;

        for (int i = 0; i < N; i++) {
            String operation = br.readLine();
            switch (operation.charAt(1)) {
                case 'u': // push
                    st = new StringTokenizer(operation);
                    st.nextToken();
                    int numItem = Integer.parseInt(st.nextToken());
                    queue.add(numItem);
                    lastPushedInteger = numItem;
                    break;
                case 'o': // pop
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.remove()).append("\n");
                    break;
                case 'i': // size
                    sb.append(queue.size()).append("\n");
                    break;
                case 'm': // empty
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 'r': // front
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.peek()).append("\n");
                    break;
                case 'a': // back
                    if (queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(lastPushedInteger).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
