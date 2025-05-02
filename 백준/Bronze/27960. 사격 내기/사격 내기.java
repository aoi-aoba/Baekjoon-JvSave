import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] aShotRes = new int[10], bShotRes = new int[10], score = new int[]{512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        Arrays.fill(aShotRes, 0);
        Arrays.fill(bShotRes, 0);
        int aShot = Integer.parseInt(st.nextToken());
        for (int i = 0; i < 10; i++) {
            if (aShot >= score[i]) {
                aShot -= score[i];
                aShotRes[i] = 1;
            } else aShotRes[i] = 0;
        }
        int bShot = Integer.parseInt(st.nextToken());
        for (int i = 0; i < 10; i++) {
            if (bShot >= score[i]) {
                bShot -= score[i];
                bShotRes[i] = 1;
            } else bShotRes[i] = 0;
        }
        int res = 0;
        for (int i = 0; i < 10; i++)
            if (aShotRes[i] + bShotRes[i] == 1) res += score[i];
        System.out.println(res);
        br.close();
    }
}