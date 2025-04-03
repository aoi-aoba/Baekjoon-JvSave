import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] joe = new int[3], bak = new int[3];
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            if(i != 0) sb.append("\n");
            StringTokenizer testCase = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) joe[j] = Integer.parseInt(testCase.nextToken());
            for (int j = 0; j < 3; j++) bak[j] = Integer.parseInt(testCase.nextToken());

            // 1차 분기 : 두 중점 사이의 거리
            double centerDist = Math.sqrt(Math.pow(joe[0] - bak[0], 2) + Math.pow(joe[1] - bak[1], 2));
            if (centerDist == 0) {
                if (joe[2] == bak[2]) sb.append(-1); // 반지름까지 같다면 동일한 원
                else sb.append(0); // 반지름이 다르면 동심원이므로 교점 없음
                continue;
            }

            // 2차 분기 : 중점 사이의 거리와 반지름의 합 비교
            double radSum = joe[2] + bak[2];
            if (centerDist > radSum) { // 두 원이 멀리 떨어져있음
                sb.append(0);
                continue;
            } else if (!(centerDist < radSum)) { // 두 원이 외접함 (부동 소수점의 오차 감안)
                sb.append(1);
                continue;
            }

            // 3차 분기 : 중점 사이의 거리와 반지름의 차 비교
            double radDiff = Math.abs(joe[2] - bak[2]);
            if (centerDist > radDiff) sb.append(2); // 두 원이 서로 교차
            else if(centerDist < radDiff) sb.append(0); // 포함관계
            else sb.append(1); // 내접관계
        }
        System.out.print(sb);
        br.close();
    }
}