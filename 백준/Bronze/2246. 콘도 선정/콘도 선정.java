import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), cnt = 0;
        int[][] arr = new int[N][2];
        boolean[] nomi = new boolean[N];
        Arrays.fill(nomi, true);

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 콘도의 바닷가로부터의 거리
            arr[i][1] = Integer.parseInt(st.nextToken()); // 콘도의 숙박비
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (arr[i][0] > arr[j][0]) // 타겟보다 더 가까운데
                    if (arr[i][1] >= arr[j][1]) { // 타겟보다 더 싸면 (값이 같은 경우도 포함)
                        nomi[i] = false;
                        break;
                    }
                if (arr[i][1] > arr[j][1]) // 타겟보다 더 싼데
                    if (arr[i][0] >= arr[j][0]) { // 타겟보다 더 가까우면 (거리가 같은 경우도 포함)
                        nomi[i] = false;
                        break;
                    }
            }
            if (nomi[i]) cnt++;
        }

        System.out.println(cnt);
    }
}