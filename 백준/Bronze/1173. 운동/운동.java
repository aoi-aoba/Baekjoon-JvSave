import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int minute = 0, pulse = 0;

        if(M - m < T) { // 초기상태에서 운동이 불가능하면
            System.out.println(-1);
            return;
        }
        pulse = m;
        while(true) {
            if(pulse + T <= M) { // 운동 가능하면
                pulse += T; // 맥박 올리고 (운동)
                N--; // 해야 할 운동 시간 낮추고
            } else { // 운동 안되면
                pulse -= R; // 맥박 낮추고 (휴식)
                if(pulse < m) // 맥박이 m보다 낮으면 안되므로
                    pulse = m; // 낮아지면 회귀
            }
            minute++; // 뭘 했든 소모한 시간
            if(N == 0) break;
        }
        System.out.println(minute);
        br.close();
    }
}