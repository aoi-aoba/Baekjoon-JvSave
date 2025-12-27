//  AC

import java.util.*;
import java.io.*;

public class Main {
    public static int t;
    public static StringBuilder sb = new StringBuilder();
    public static void operator(char[] op, int n, Deque<Integer> dq) {
        boolean isBeginZero = true, errorOccured = false;
        for (char ch : op) {
            if (ch == 'R') isBeginZero = !isBeginZero;
            else {
                if (dq.size() == 0) {
                    errorOccured = true;
                    break;
                }
                if (isBeginZero) dq.removeFirst();
                else dq.removeLast();
            }
        }
        if (errorOccured) sb.append("error\n");
        else {
            sb.append('[');
            while (!dq.isEmpty()) {
                if (isBeginZero) sb.append(dq.removeFirst());
                else sb.append(dq.removeLast());
                if (dq.size() != 0) sb.append(',');
            }
            sb.append(']').append('\n');
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            char[] op = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> dq = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(br.readLine().replace("[", "").replace("]", ""), ",");
            for (int i = 0; i < n; i++) dq.addLast(Integer.parseInt(st.nextToken()));
            operator(op, n, dq);
        }
        System.out.println(sb);
    }
}