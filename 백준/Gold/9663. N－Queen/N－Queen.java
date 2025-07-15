import java.io.*;
import java.util.*;

public class Main {
    public static int result = 0, N = 0;
    public static void tracker(int depth, int[] queenPosCol) {
        if (checkPos(depth, queenPosCol)) {
            // 지금까지 둔 것이 모두 옳게 작동한다면
            if (depth == N) result++;
            else {
                for (int j = 1; j < N + 1; j++) {
                    queenPosCol[depth + 1] = j;
                    // 다음 depth의 Column 내에 Queen을 전부 둬서 tracker를 재귀호출
                    tracker(depth + 1, queenPosCol);
                }
            }
        }
    }
    public static boolean checkPos(int i, int[] queenPosCol) {
        // i번째 column에 퀸을 둔다고 할 때
        int k = 1;
        boolean flag = true;
        while (k < i && flag) {
            // i보다 더 적은 column에 대하여
            if (queenPosCol[i] == queenPosCol[k] 
                    || Math.abs(queenPosCol[i] - queenPosCol[k]) == (i - k))
                // 동일한 Column에 있거나 대각선 상에 있는 경우 둘 수 없으므로 flag를 false로
                // 대각선상이라는 것은 col과 row 차가 같음을 이용
                flag = false;
            k++;
        }
        return flag;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        int[] queenPosCol = new int[N + 1];
        Arrays.fill(queenPosCol, 0); // 처음은 (0, 0, ..., 0)의 아무것도 안 놓은 상태
        tracker(0, queenPosCol);
        bw.write(String.valueOf(result));
        bw.flush();
    }
}