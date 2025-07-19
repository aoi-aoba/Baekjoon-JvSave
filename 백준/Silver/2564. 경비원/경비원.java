import java.io.*;
import java.util.*;

public class Main {
    public static int xMax, yMax, roundDist, N;
    public static int distCalc(ArrayList<Integer> list, int dgCWPos) {
        int result = 0;
        for (int i = 0; i < N; i++) {
            int distCW = Math.abs(list.get(i) - dgCWPos);
            int distCCW = roundDist - distCW;
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
        roundDist = 2 * (xMax + yMax);

        N = Integer.parseInt(br.readLine());
        ArrayList<Integer> storeCWDistList = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            StringTokenizer pos = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(pos.nextToken()), dist = Integer.parseInt(pos.nextToken());
            storeCWDistList.add(switch (dir) {
                // 좌상측 꼭짓점 기준의 Clockwise Distance
                case 1 -> dist; // 북쪽은 시계방향 상 최초
                case 2 -> xMax + yMax + (xMax - dist); // 남쪽은 북-동 지나서 남
                case 3 -> 2 * xMax + yMax + (yMax - dist); // 서쪽은 북-동-남 지나서 서
                default -> xMax + dist; // 동쪽은 북 지나서 동
            });
        }

        bw.write(String.valueOf(distCalc(storeCWDistList, storeCWDistList.get(N))));
        bw.flush();
    }
}