import java.io.*;
import java.util.*;

public class Main {
    public static int N, M, minDist = Integer.MAX_VALUE;
    public static List<int[]> chickens = new ArrayList<>(), house = new ArrayList<>(), nowChickens = new ArrayList<>();
    public static int distCalc(int[] posChicken, int[] posHouse) {
        return Math.abs(posChicken[0] - posHouse[0]) + Math.abs(posChicken[1] - posHouse[1]);
    }
    public static void tracker(int closeIdx, int closeNum) {
        if (closeNum == M) {
            int distSum = 0;
            for (int i = 0; i < house.size(); i++) {
                int[] posHouse = house.get(i);
                int distForChicken = Integer.MAX_VALUE;
                for (int j = 0; j < nowChickens.size(); j++) {
                    int[] posChicken = nowChickens.get(j);
                    distForChicken = Math.min(distForChicken, distCalc(posChicken, posHouse));
                }
                distSum += distForChicken;
            }
            minDist = Math.min(minDist, distSum);
        }
        for (int i = closeIdx; i < chickens.size(); i++) {
            nowChickens.add(chickens.get(i));
            tracker(i + 1, closeNum + 1);
            nowChickens.remove(chickens.get(i));
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp == 1) house.add(new int[]{i, j});
                else if (temp == 2) chickens.add(new int[]{i, j});
            }
        }

        tracker(0, 0);
        bw.write(String.valueOf(minDist));
        bw.flush();
    }
}