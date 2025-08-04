import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), result = 1;
        int[][] tasks = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            tasks[i][0] = Integer.parseInt(st.nextToken()); // 시작시간
            tasks[i][1] = Integer.parseInt(st.nextToken()); // 종료시간
        }

        // 종료 시각을 기준으로 회의들을 정렬, 종료 시각이 같으면 시작 시간 기준으로 정렬
        Arrays.sort(tasks, new Comparator<int[]>() {
            @Override
            public int compare(int[] task1, int[] task2) {
                if (task1[1] == task2[1]) return Integer.compare(task1[0], task2[0]);
                else return Integer.compare(task1[1], task2[1]);
            }
        });

        int end = tasks[0][1]; // 종료 시각이 가장 빠른 회의는 무조건 진행한다 (result가 1인 이유)
        for (int i = 1; i < N; i++) {
            if (end <= tasks[i][0]) {
                // 회의 종료 동시에 다음 회의 시작 가능이라 했으므로 end가 특정 회의 이하이면 됨
                end = tasks[i][1]; // 해당 회의 진행
                result++; // 회의 개수 증가
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}
