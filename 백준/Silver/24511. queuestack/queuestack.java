import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] queueOrStack = new int[N];
        Deque<Integer> queueStack = new ArrayDeque<>();

        StringTokenizer qs = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
            queueOrStack[i] = Integer.parseInt(qs.nextToken());
        StringTokenizer dv = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            if (queueOrStack[i] == 0) queueStack.add(Integer.parseInt(dv.nextToken()));
            else dv.nextToken();
        }


        int T = Integer.parseInt(br.readLine());
        StringTokenizer cn = new StringTokenizer(br.readLine());
        while(T > 0) {
            int c = Integer.parseInt(cn.nextToken());
            queueStack.addFirst(c);
            res.append(queueStack.removeLast()).append(" ");
            T--;
        }

        System.out.println(res);
        br.close();
    }
}