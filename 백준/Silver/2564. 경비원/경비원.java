import java.io.*;
import java.util.*;

public class Main {
    public static int xMax, yMax, N;
    public static int distCalc(ArrayList<Integer> list, int dgCWPos) {
        int result = 0;
        for (int i = 0; i < N; i++) {
            int distCW = Math.abs(list.get(i) - dgCWPos);
            int distCCW = 2 * (xMax + yMax) - distCW;
            result += Math.min(distCW, distCCW);
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer area = new StringTokenizer(br.readLine());
        xMax = Integer.parseInt(area.nextToken());
        yMax = Integer.parseInt(area.nextToken());

        N = Integer.parseInt(br.readLine());
        // 좌상측 꼭짓점 기준의 Clockwise Distance를 저장
        ArrayList<Integer> storeCWDs = new ArrayList<>();

        for (int i = 0; i < N + 1; i++) {
            StringTokenizer pos = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(pos.nextToken()), dist = Integer.parseInt(pos.nextToken());

            if (dir == 1) storeCWDs.add(dist); // 북쪽은 시계방향 상 최초
            else if (dir == 2) storeCWDs.add(xMax + yMax + (xMax - dist)); // 남쪽은 북-동 지나서 남
            else if (dir == 3) storeCWDs.add(2 * xMax + yMax + (yMax - dist)); // 서쪽은 북-동-남 지나서 서
            else storeCWDs.add(xMax + dist); // 동쪽은 북 지나서 동
        }

        bw.write(String.valueOf(distCalc(storeCWDs, storeCWDs.get(N))));
        bw.flush();
    }
}