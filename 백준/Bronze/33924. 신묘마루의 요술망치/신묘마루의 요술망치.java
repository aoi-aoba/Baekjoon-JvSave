import java.io.*;
import java.util.*;

public class Main {
    public static boolean[][] arr = new boolean[4][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        arr[n-1][m-1] = true;
        int k = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for (int i = 0; i < k; i++) {
            boolean[][] moved = new boolean[4][2];
            switch (str.charAt(i)) {
                case 'A':
                    moved[0][0] = arr[2][0];
                    moved[0][1] = arr[2][1];
                    moved[1][0] = arr[3][0];
                    moved[1][1] = arr[3][1];
                    moved[2][0] = arr[0][0];
                    moved[2][1] = arr[0][1];
                    moved[3][0] = arr[1][0];
                    moved[3][1] = arr[1][1];
                    arr = moved;
                    break;
                case 'B':
                    moved[0][0] = arr[1][1];
                    moved[0][1] = arr[1][0];
                    moved[1][0] = arr[0][1];
                    moved[1][1] = arr[0][0];
                    moved[2][0] = arr[3][1];
                    moved[2][1] = arr[3][0];
                    moved[3][0] = arr[2][1];
                    moved[3][1] = arr[2][0];
                    arr = moved;
                    break;
                case 'C':
                    moved[0][0] = arr[3][1];
                    moved[0][1] = arr[3][0];
                    moved[1][0] = arr[2][1];
                    moved[1][1] = arr[2][0];
                    moved[2][0] = arr[1][1];
                    moved[2][1] = arr[1][0];
                    moved[3][0] = arr[0][1];
                    moved[3][1] = arr[0][0];
                    arr = moved;
                    break;
                case 'D':
                    moved[0][0] = arr[1][0];
                    moved[0][1] = arr[0][0];
                    moved[1][0] = arr[2][0];
                    moved[1][1] = arr[0][1];
                    moved[2][0] = arr[3][0];
                    moved[2][1] = arr[1][1];
                    moved[3][0] = arr[3][1];
                    moved[3][1] = arr[2][1];
                    arr = moved;
                    break;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[i][j]) System.out.println((i + 1) + " " + (j + 1));
            }
        }
    }
}