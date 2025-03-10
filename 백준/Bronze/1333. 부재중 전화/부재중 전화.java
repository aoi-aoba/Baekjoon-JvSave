import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken());
        boolean[] time = new boolean[N * L + (N-1) * 5];

        for(int i = 0; i < N; i++) {
            int set = (L + 5) * i; // i번째 곡의 시작 시간
            for(int j = set; j < set + L; j++) // 곡이 진행되는 시간 내
                time[j] = true; // 노래가 나오면 true, 아니면 false
        }

        int bell = 0;
        while(bell < time.length) {
            if(time[bell])
                bell += D; // 벨소리가 만약 노래 나오는 시간대에 울리면 D값 더함
            else break; // 아닐 경우 벨소리가 들리므로 바로 break
        }
        System.out.println(bell);
        br.close();
    }
}