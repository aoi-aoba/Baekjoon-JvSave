import java.util.*;
import java.io.*;

public class Main {
    public static int scoreForDist(double dist) {
        if (dist <= 3.0) return 100;
        else if (dist <= 6.0) return 80;
        else if (dist <= 9.0) return 60;
        else if (dist <= 12.0) return 40;
        else if (dist <= 15.0) return 20;
        else return 0;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int scorePlayer1 = 0, scorePlayer2 = 0;
            for (int i = 0; i < 3; i++) {
                double posX = Double.parseDouble(st.nextToken()), posY = Double.parseDouble(st.nextToken());
                double dist = Math.sqrt(Math.pow(posX, 2) + Math.pow(posY, 2));
                scorePlayer1 += scoreForDist(dist);
            }
            for (int i = 0; i < 3; i++) {
                double posX = Double.parseDouble(st.nextToken()), posY = Double.parseDouble(st.nextToken());
                double dist = Math.sqrt(Math.pow(posX, 2) + Math.pow(posY, 2));
                scorePlayer2 += scoreForDist(dist);
            }
            if (scorePlayer1 == scorePlayer2)
                out.append(String.format("SCORE: %d to %d, TIE.\n", scorePlayer1, scorePlayer2));
            else out.append(String.format("SCORE: %d to %d, PLAYER %d WINS.\n", scorePlayer1, scorePlayer2, (scorePlayer2 > scorePlayer1 ? 2 : 1)));
        }

        bw.write(out.toString());
        bw.flush();
    }
}