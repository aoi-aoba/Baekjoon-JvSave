import java.io.*;
import java.util.*;

public class Main {
	public static int N, whiteTot, blueTot;
    public static int[][] board;
	public static void divideCnt(int startIdxI, int endIdxI, int startIdxJ, int endIdxJ) {
		int white = 0, blue = 0;
		for (int i = startIdxI; i < endIdxI; i++) {
			for (int j = startIdxJ; j < endIdxJ; j++) {
			  if (board[i][j] == 0) white++;
			  else blue++;
			}
		}
		if (blue == 0) {
			whiteTot++;
			return;
		} else if (white == 0) {
			blueTot++;
			return;
		} else {
			int midI = (startIdxI + endIdxI) / 2;
			int midJ = (startIdxJ + endIdxJ) / 2;
			divideCnt(startIdxI, midI, startIdxJ, midJ);
			divideCnt(midI, endIdxI, startIdxJ, midJ);
			divideCnt(startIdxI, midI, midJ, endIdxJ);
			divideCnt(midI, endIdxI, midJ, endIdxJ);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		board = new int[N][N];

		for (int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0; j<N; j++)
				board[i][j] = Integer.parseInt(st.nextToken());
		}
        
		divideCnt(0, N, 0, N);
		System.out.println(whiteTot);
		System.out.println(blueTot);
	}
}