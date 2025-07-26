import java.io.*;
import java.util.*;

public class Main {
    static int result = 0, N;
    static Egg[] eggs;
    public static class Egg {
        int weight, durability;
        public Egg(int weight, int strength) {
            this.weight = weight;
            this.durability = strength;
        }
    }
    public static void tracker(int nowSelect, int brokenCnt) {
        if (nowSelect == N) {
            result = Math.max(brokenCnt, result);
            return;
        }
        if (eggs[nowSelect].durability <= 0 || brokenCnt == N - 1)
            tracker(nowSelect + 1, brokenCnt);
        else for (int breakSelect = 0; breakSelect < N; breakSelect++) {
            if (breakSelect == nowSelect || eggs[breakSelect].durability <= 0) continue;

            eggs[nowSelect].durability -= eggs[breakSelect].weight;
            eggs[breakSelect].durability -= eggs[nowSelect].weight;

            int add = (eggs[nowSelect].durability <= 0 ? 1 : 0) + (eggs[breakSelect].durability <= 0 ? 1 : 0);
            tracker(nowSelect + 1, brokenCnt + add);

            eggs[nowSelect].durability += eggs[breakSelect].weight;
            eggs[breakSelect].durability += eggs[nowSelect].weight;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        eggs = new Egg[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sth = Integer.parseInt(st.nextToken()), wht = Integer.parseInt(st.nextToken());
            Egg egg = new Egg(wht, sth);
            eggs[i] = egg;
        }

        tracker(0, 0);
        bw.write(String.valueOf(result));
        bw.flush();
    }
}