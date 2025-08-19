import java.io.*;

public class Main {
    static StringBuilder result = new StringBuilder();
    static boolean[][] answer;

    // (i, j) 위치부터 (i+n-1, j+n-1) 위치까지
    public static void makeStar(int i, int j, int n) {
        if (n == 1) {
            answer[i][j] = true;
            return;
        }

        int k = n / 3; // 판을 3등분하자
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (r == 1 && c == 1) continue;
                // 3등분한 판의 인덱스 1 부분, 즉 중간은 무시한다
                makeStar(i + r * k, j + c * k, k);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        answer = new boolean[N][N];
        makeStar(0, 0, N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                result.append(answer[i][j] ? "*" : " ");
            result.append("\n");
        }

        System.out.println(result);
    }
}