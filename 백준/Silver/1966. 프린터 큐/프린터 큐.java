import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while(T > 0) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
           LinkedList<int[]> queue = new LinkedList<>();

           st = new StringTokenizer(br.readLine());
           for(int i=0; i<N; i++) queue.add(new int[] {i, Integer.parseInt(st.nextToken())});
           int cnt = 0;

           while(!queue.isEmpty()) {
               boolean isMax = true;
               int[] now = queue.remove(); // 큐의 맨 앞 값을 받아서

               for(int i=0; i<queue.size(); i++) {
                   if(now[1] < queue.get(i)[1]) {
                       queue.offer(now); // tail 부분에 요소를 추가하는 메소드 offer
                       for(int j=0; j<i; j++) queue.offer(queue.poll());
                       isMax = false;
                       break;
                   } // 큐의 맨 앞 값의 중요도가 뒤에 있는 것보다 작으면 뽑은 원소 및 i 이전 원소들을 뒤로 보낸다
               }

               if(isMax) { // front 원소가 가장 큰 원소면 해당 종이를 출력함
                   cnt++;
                   if(now[0] == M) break; // 출력하는 종이가 찾던 종이면 break
               }
           }
           res.append(cnt).append("\n");
           T--;
        }
        System.out.print(res);
        br.close();
    }
}