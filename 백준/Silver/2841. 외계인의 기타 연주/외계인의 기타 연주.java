import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), cnt = 0;
        Stack<Integer>[] stacks = new Stack[N];
        Arrays.fill(stacks, null);
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int line = Integer.parseInt(st.nextToken()) - 1, fret = Integer.parseInt(st.nextToken());
            if(stacks[line] == null) {
                Stack<Integer> stack = new Stack<>();
                stack.push(fret);
                stacks[line] = stack;
                cnt++;
            } else if(stacks[line].get(0) > fret) {
                cnt += stacks[line].size() + 1;
                Stack<Integer> stack = new Stack<>();
                stack.push(fret);
                stacks[line] = stack;
            } else {
                while(stacks[line].peek() > fret) {
                    stacks[line].pop();
                    cnt++;
                }
                if(stacks[line].peek() < fret) {
                    stacks[line].push(fret);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}