import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] brokenKey = new boolean[10];
    public static int upsideMove, downsideMove, N, M;
    public static int upsideCheck(int num) {
        while (true) {
            boolean canBePressed = true;
            for (char ch : String.valueOf(num).toCharArray())
                if (brokenKey[ch - '0']) canBePressed = false;
            if (canBePressed) return num;
            num++;
            if (downsideMove != -1 && Math.abs(num - N) + String.valueOf(num).length() > downsideMove) return -1;
        }
    }
    public static int downsideCheck(int num) {
        if (num == 0) return -1;
        while (true) {
            num--;
            if (num == -1) return -1;
            boolean canBePressed = true;
            for (char ch : String.valueOf(num).toCharArray())
                if (brokenKey[ch - '0']) canBePressed = false;
            if (canBePressed) return num;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        int now = 100, res = 0;
        if (M != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) brokenKey[Integer.parseInt(st.nextToken())] = true;
        }

        if (N == 100) System.out.println(0); // 이동 필요가 없는 경우
        else if (M == 0) { // 모든 키가 다 살아있는 경우
            int directMove = String.valueOf(N).length();
            int defMove = Math.abs(100-N);
            System.out.println(Math.min(directMove, defMove));
        }
        else if (M == 9 && !brokenKey[0]) { // 0번 키를 제외한 모든 키가 망가진 경우
            int defMove = Math.abs(100-N);
            int zeroMove = 1 + N;
            System.out.println(Math.min(defMove, zeroMove));
        }
        else if (M == 10) System.out.println(Math.abs(100 - N)); // 숫자 키가 그냥 다 망가진 경우
        else {
            downsideMove = (downsideCheck(N) == -1) ? -1 : Math.abs(downsideCheck(N) - N) + String.valueOf(downsideCheck(N)).length(); // 아래쪽 경우가 더 횟수 적음
            upsideMove = (upsideCheck(N) == -1) ? -1 : Math.abs(upsideCheck(N) - N) + String.valueOf(upsideCheck(N)).length();

            int defMove = Math.abs(100 - N);
            if (upsideMove == -1 && downsideMove == -1) System.out.println(defMove);
            else if (upsideMove == -1) System.out.println(Math.min(downsideMove, defMove));
            else if (downsideMove == -1) System.out.println(Math.min(upsideMove, defMove));
            else System.out.println(Math.min(upsideMove, Math.min(downsideMove, defMove)));
        }
    }
}