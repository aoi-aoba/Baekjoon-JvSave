import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), result = 0;
        ArrayList<int[]> checkList = new ArrayList<>();
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int[] check = new int[5];
            check[0] = num / 100;
            check[1] = num / 10 % 10;
            check[2] = num % 10;
            check[3] = Integer.parseInt(st.nextToken()); // strike
            check[4] = Integer.parseInt(st.nextToken()); // ball
            checkList.add(check);
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i == j || j == k || i == k) continue;
                    boolean isAns = true;
                    for (int[] check : checkList) {
                        int strike = 0, ball = 0;
                        if (i == check[0]) strike++;
                        else if (i == check[1]) ball++;
                        else if (i == check[2]) ball++;
                        if (j == check[1]) strike++;
                        else if (j == check[0]) ball++;
                        else if (j == check[2]) ball++;
                        if (k == check[2]) strike++;
                        else if (k == check[0]) ball++;
                        else if (k == check[1]) ball++;
                        if (strike != check[3] || ball != check[4]) {
                            isAns = false;
                            break;
                        }
                    }
                    if (isAns) result++;
                }
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}