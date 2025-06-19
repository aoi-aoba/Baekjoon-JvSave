import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int N, M, result = 0;
    public static int[][] board;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        initInput(); // 입력처리
        searchAll(); // 부분집합 전탐색
        System.out.println(result);
    }
    public static void initInput() throws IOException {
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++)
                board[i][j] = str.charAt(j) - '0'; // '0'을 안 빼주면 char 값이 들어감
        }
    }
    public static boolean isHorizontal(int i, int j, int bitMask) {
        return (bitMask & (1 << (i * M + j))) == 0;
        // 해당 칸이 가로 방향이라면, 즉 0이라면 원소 찾기 비트마스킹 연산을 한 현재 결과가 true
    }
    public static void searchAll() {
        int bits = (1 << (N * M)) - 1;
        for (int bitmask = bits; ; bitmask = (bitmask - 1) & bits) { // 비트마스킹 부분집합 전탐색
            int num = 0, sum = 0;
            for (int i = 0; i < N; i++)  {
                for (int j = 0; j < M; j++) {
                    if (isHorizontal(i, j, bitmask)) // 해당 칸이 가로 방향, 즉 0일 때
                        num = num * 10 + board[i][j]; // 숫자를 덮어씌우는 과정
                    else if (num != 0) { // 0이 아니면서 저장된 숫자가 있으면
                        sum += num; // sum에 합쳐주고
                        num = 0; // 0으로 초기화
                    }
                }
                if (num > 0) sum += num;
                num = 0;
                // 한 줄이 끝났으므로 초기화
            }
            for (int j = 0; j < M; j++) {
                for (int i = 0; i < N; i++) {
                    if (!isHorizontal(i, j, bitmask)) // 해당 칸이 세로 방향, 즉 1일 때
                        num = num * 10 + board[i][j]; // 숫자를 덮어씌우는 과정
                    else if (num != 0) { // 1이 아니면서 저장된 숫자가 있으면
                        sum += num; // sum에 합쳐주고
                        num = 0; // 0으로 초기화
                    }
                }
                if (num > 0) sum += num;
                num = 0;
                // 한 줄이 끝났으므로 초기화
            }
            result = Math.max(result, sum);
            if (bitmask == 0) break;
            // 공집합(000...0)의 경우도 체크해야 하므로 condition을 for 문 안에서 직접지정
        }
    }
}
