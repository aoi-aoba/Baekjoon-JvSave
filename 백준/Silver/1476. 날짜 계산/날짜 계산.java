import java.io.*;
import java.util.*;

public class Main {
    public static int calcYear(int Earth, int Sun, int Moon) {
        int cnt = 1, nowE = 1, nowS = 1, nowM = 1;
        while (true) {
            if (nowE == Earth && nowS == Sun && nowM == Moon) break;
            nowE = (nowE + 1 > 15) ? 1 : nowE + 1;
            nowS = (nowS + 1 > 28) ? 1 : nowS + 1;
            nowM = (nowM + 1 > 19) ? 1 : nowM + 1;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int earth = Integer.parseInt(st.nextToken()), sun = Integer.parseInt(st.nextToken()), moon = Integer.parseInt(st.nextToken());
        System.out.println(calcYear(earth, sun, moon));
    }
}