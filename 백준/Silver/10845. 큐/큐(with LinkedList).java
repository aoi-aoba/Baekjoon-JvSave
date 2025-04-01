import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        Iterator<Integer> listIter = queue.listIterator();

        for (int i = 0; i < N; i++) {
            String operation = br.readLine();
            switch (operation.charAt(1)) {
                case 'u': // push
                    st = new StringTokenizer(operation);
                    st.nextToken();
                    queue.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 'o': // pop
                    if(queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.removeFirst()).append("\n");
                    break;
                case 'i': // size
                    sb.append(queue.size()).append("\n");
                    break;
                case 'm': // empty
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 'r': // front
                    if(queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.getFirst()).append("\n");
                    break;
                case 'a': // back
                    if(queue.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(queue.getLast()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
        br.close();
    }
}
