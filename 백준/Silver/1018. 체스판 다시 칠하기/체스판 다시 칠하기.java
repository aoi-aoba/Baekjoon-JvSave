import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        boolean[][] whiteCellStart = new boolean[n][m];
        boolean[][] blackCellStart = new boolean[n][m];

        for(int i=0; i<n; i++) {
            char[] temp = br.readLine().toCharArray();
            for(int j=0; j<m; j++) {
                if(i % 2 == 0) { // 짝수 index 세로줄 (0, 2, 4...)
                    if(j % 2 == 0) { // 짝수 index 칸(0, 2, 4...)이면 시작 셀과 동일
                        whiteCellStart[i][j] = (temp[j] == 'W');
                        blackCellStart[i][j] = (temp[j] == 'B');
                    } else { // 홀수 index 칸(1, 3, 5...)이면 시작 셀의 반대
                        whiteCellStart[i][j] = (temp[j] == 'B');
                        blackCellStart[i][j] = (temp[j] == 'W');
                    }
                } else { // 홀수 index 세로줄 (1, 3, 5...)
                    if(j % 2 == 0) { // 짝수 index 칸(0, 2, 4...)이면 시작 셀의 반대
                        whiteCellStart[i][j] = (temp[j] == 'B');
                        blackCellStart[i][j] = (temp[j] == 'W');
                    } else { // 홀수 index 칸(1, 3, 5...)이면 시작 셀과 동일
                        whiteCellStart[i][j] = (temp[j] == 'W');
                        blackCellStart[i][j] = (temp[j] == 'B');
                    }
                }
            }
        }

        int white_min = 65, black_min = 65;
        n -= 8;
        m -= 8;
        // 어차피 index 다 돌아봐야 마지막은 8개를 못 도니까 확정적으로 돌 수 있게 8 미리 빼두기

        for(int i=0; i<=n; i++) { // 세로줄
            for(int k = 0; k <= m; k++){ // 가로줄
                int temp_white = 0, temp_black = 0;
                for (int j = i; j < i + 8; j++) {
                    for (int l = k; l < k + 8; l++) {
                        if (!whiteCellStart[j][l]) temp_white++;
                        if (!blackCellStart[j][l]) temp_black++;
                        // false 값을 가진 경우 그 위치에 그 색이 아닌거니까 not 조건
                    }
                }
                white_min = Math.min(temp_white, white_min);
                black_min = Math.min(temp_black, black_min);
            }
        }

        System.out.println(Math.min(white_min, black_min));
        // 첫 칸이 W 또는 B 값을 가지는 경우를 각각 돌려서 최소를 구하기
        br.close();
    }
}

/*
 브루트포스 알고리즘으로 풀기
 - 왼쪽 위가 W or B인 경우에 대해서 시행
 - 입력받은 n*m 크기의 2차원 배열에 대해 시행
 - 제대로 들어갔으면 true, 색이 잘못됐으면 false 값이 들어가는 boolean 배열
 - true 개수가 최소인 경우를 8*8 정사각형을 계속 만들어서 실행
 */