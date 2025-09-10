import java.io.*;
import java.util.*;

public class Main {
	public static int n, m, k;
	public static char[][] board;
	public static int[][] whiteWrongCnt, blackWrongCnt;
	public static void checkBoard() {
		whiteWrongCnt = new int[n + 1][m + 1];
		blackWrongCnt = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				if (i * j == 0) continue;
				whiteWrongCnt[i][j] = whiteWrongCnt[i - 1][j] + whiteWrongCnt[i][j - 1] - whiteWrongCnt[i - 1][j - 1];
				blackWrongCnt[i][j] = blackWrongCnt[i - 1][j] + blackWrongCnt[i][j - 1] - blackWrongCnt[i - 1][j - 1];

				if (board[i][j] == 'B') {
					whiteWrongCnt[i][j] += ((i + j) % 2 == 0) ? 1 : 0;
					blackWrongCnt[i][j] += ((i + j) % 2 == 0) ? 0 : 1;
				} else {
					whiteWrongCnt[i][j] += ((i + j) % 2 == 0) ? 0 : 1;
					blackWrongCnt[i][j] += ((i + j) % 2 == 0) ? 1 : 0;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		board = new char[n + 1][m + 1];
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++)
				board[i + 1][j + 1] = str.charAt(j);
		}

		checkBoard();
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= n - k + 1; i++) {
			for (int j = 1; j <= m - k + 1; j++) {
				int w = whiteWrongCnt[i + k - 1][j + k - 1]
						- whiteWrongCnt[i - 1][j + k - 1]
						- whiteWrongCnt[i + k - 1][j - 1]
						+ whiteWrongCnt[i - 1][j - 1];
				int b = blackWrongCnt[i + k - 1][j + k - 1]
						- blackWrongCnt[i - 1][j + k - 1]
						- blackWrongCnt[i + k - 1][j - 1]
						+ blackWrongCnt[i - 1][j - 1];
				min = Math.min(min, Math.min(w, b));
			}
		}
		System.out.println(min);
	}
}