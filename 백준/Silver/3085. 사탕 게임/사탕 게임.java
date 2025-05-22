import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static char[][] board;
    public static int max = 0, N = 0;
    public static void checkBoard() {
        for (int i = 0; i < N; i++) {
            char prev = ' ';
            int now = 1, maxFor = 0;
            for (int j = 0; j < N; j++) {
                if (prev == board[i][j]) now++;
                else {
                    maxFor = Math.max(maxFor, now);
                    prev = board[i][j];
                    now = 1;
                }
            }
            maxFor = Math.max(now, maxFor);
            max = Math.max(max, maxFor);
        }
        for (int i = 0; i < N; i++) {
            char prev = ' ';
            int now = 1, maxFor = 0;
            for (int j = 0; j < N; j++) {
                if (prev == board[j][i]) now++;
                else {
                    maxFor = Math.max(maxFor, now);
                    prev = board[j][i];
                    now = 1;
                }
            }
            maxFor = Math.max(now, maxFor);
            max = Math.max(max, maxFor);
        }
    }
    public static void downSwap(int pointY, int pointX) {
        char temp = board[pointY][pointX];
        board[pointY][pointX] = board[pointY+1][pointX];
        board[pointY+1][pointX] = temp;
    }
    public static void rightSwap(int pointY, int pointX) {
        char temp = board[pointY][pointX];
        board[pointY][pointX] = board[pointY][pointX+1];
        board[pointY][pointX+1] = temp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new char[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) board[i][j] = str.charAt(j);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i + 1 < N) {
                    downSwap(i, j);
                    checkBoard();
                    downSwap(i, j);
                }
                if (j + 1 < N) {
                    rightSwap(i, j);
                    checkBoard();
                    rightSwap(i, j);
                }
            }
        }
        System.out.println(max);
    }
}