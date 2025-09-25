import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] infos = new int[6];
    public static double dist(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    public static boolean check(int x, int y) {
        int xlow = infos[2], ylow = infos[3], xhigh = xlow + infos[0], yhigh = ylow + infos[1];
        if (x >= xlow && x <= xhigh && y >= ylow && y <= yhigh) return true;
        int cy = ylow + infos[5];
        if (dist(x, y, xlow, cy) <= infos[5] || dist(x, y, xhigh, cy) <= infos[5]) return true;
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) infos[i] = Integer.parseInt(st.nextToken());
        int cnt = 0;
        infos[5] = infos[1] / 2;
        for (int i = 0; i < infos[4]; i++) {
            st = new StringTokenizer(br.readLine());
            if (check(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())))
                cnt++;
        }
        System.out.println(cnt);
    }
}