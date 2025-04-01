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
        int[] queue = new int[N];
        int front = 0, tail = -1, numItems = 0;

        for (int i = 0; i < N; i++) {
            String operation = br.readLine();
            switch (operation.charAt(1)) {
                case 'u': // push
                    st = new StringTokenizer(operation);
                    st.nextToken();
                    queue[++tail] = Integer.parseInt(st.nextToken());
                    ++numItems;
                    break;
                case 'o': // pop
                    if(numItems == 0) sb.append(-1).append("\n");
                    else {
                        sb.append(queue[front++]).append("\n");
                        --numItems;
                    }
                    break;
                case 'i': // size
                    sb.append(numItems).append("\n");
                    break;
                case 'm': // empty
                    sb.append(numItems == 0 ? 1 : 0).append("\n");
                    break;
                case 'r': // front
                    if(numItems == 0) sb.append(-1).append("\n");
                    else sb.append(queue[front]).append("\n");
                    break;
                case 'a': // back
                    if(numItems == 0) sb.append(-1).append("\n");
                    else sb.append(queue[tail]).append("\n");
                    break;
            }
        }
        System.out.print(sb);
        br.close();
    }
}