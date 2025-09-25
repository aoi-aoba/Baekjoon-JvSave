import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] length = new int[6];
        int maxWidth = 0, maxWidthI = 0, maxHeight = 0, maxHeightI = 0;

        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            int direction = Integer.parseInt(st.nextToken()); //방향
            length[i] = Integer.parseInt(st.nextToken());
            // 가로 값
            if (direction == 1 || direction == 2) {
                // 최대 가로, 최대 가로의 인덱스 구하기
                if (maxHeight < length[i]) {
                    maxHeight = length[i];
                    maxHeightI = i;
                }
             // 세로 값
            } else if (direction == 3 || direction == 4) {
            	// 최대 세로, 최대 세로의 인덱스 구하기 
                if (maxWidth < length[i]) {
                    maxWidth = length[i];
                    maxWidthI = i;
                }
            }
        }

        // 제외할 사각형의 가로 세로 찾기
        int minWidth = 0, minHeight = 0;	// 최소 가로,세로
        for (int i = 0; i < 6; i++) {
            //index가 0보다 작거나 6보다 큰 경우 나눠서 설정하기
            int preIdx = (i - 1) < 0 ? 5 : i - 1;   // 이전 인덱스
            int nextIdx = (i + 1) >= 6 ? 0 : i + 1; // 이후 인덱스

            if (i == maxHeightI) {
                minHeight = Math.abs(length[preIdx] - length[nextIdx]);
            } else if (i == maxWidthI) {
                minWidth = Math.abs(length[preIdx] - length[nextIdx]);
            }
        }

        // 전체 면적 = 최대 가로 * 최대 세로
        // 제외할 면적 = 최소 가로 * 최소 세로
        System.out.println(n * ((maxWidth * maxHeight) - (minWidth * minHeight)));

    }
}