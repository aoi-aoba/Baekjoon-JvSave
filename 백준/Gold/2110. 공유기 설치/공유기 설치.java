import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());

        // 입력 받아서 집 좌표 정렬
        int[] homes = new int[n];
        for (int i = 0; i < n; i++)
            homes[i] = Integer.parseInt(br.readLine());
        Arrays.sort(homes);

        // 집 사이 거리 초기화 (최소 1, 최대 끝집-첫집)
        int start = 1, end = homes[n-1] - homes[0], res = 0;

        // 거리 활용 이분탐색
        while (start <= end) {
            int mid = (start + end) / 2, cnt = 1, prev = homes[0];
            for (int i = 0; i < n; i++)
                if (homes[i] - prev >= mid) {
                    cnt++;
                    prev = homes[i];
                }

            // 이분탐색 만족 거리 중 최댓값 갱신
            // 만약 공유기 제한 개수 이상일 경우 설치 거리 확장
            if (cnt >= c) {
                res = Math.max(res, mid);
                start = mid + 1;
            }
            // 공유기 제한 개수 미만이면 설치 거리 좁히고 다시
            else end = mid - 1;
        }

        System.out.println(res);
    }
}