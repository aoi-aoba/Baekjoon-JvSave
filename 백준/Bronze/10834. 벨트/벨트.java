import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine()), rpmForFin = 1;
        boolean isFinGoClock = true;
        while (M-- != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int belt_i = Integer.parseInt(st.nextToken()), belt_ii = Integer.parseInt(st.nextToken());
            rpmForFin = rpmForFin / belt_i * belt_ii;
            boolean isTwisted = Integer.parseInt(st.nextToken()) != 0;
            isFinGoClock = isTwisted != isFinGoClock;
        }
        System.out.println((isFinGoClock ? 0 : 1) + " " + rpmForFin);
        br.close();
    }
}