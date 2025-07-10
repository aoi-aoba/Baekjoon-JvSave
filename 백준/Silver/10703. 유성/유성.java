import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken());
        char[][] image = new char[R][S];

        for (int r = 0; r < R; r++) {
            String input = br.readLine();
            for (int s = 0; s < S; s++)
                image[r][s] = input.charAt(s);
        }

        int[] meteorDistArr = new int[S], meteorStartIdxArr = new int[S], grounds = new int[S];
        int distForMeteorMove = Integer.MAX_VALUE;
        for (int s = 0; s < S; s++) {
            int dist = 0, meteorStartIdx = 0, ground = 0;
            boolean meteorCheck = false;
            for (int r = R - 1; r >= 0; r--) {
                if (image[r][s] == '.' && !meteorCheck) dist++;
                else if (image[r][s] == '#') {
                    dist = 0;
                    ground = R - r;
                }
                else if (image[r][s] == 'X')
                    if (!meteorCheck) {
                        meteorCheck = true;
                        meteorStartIdx = r;
                    }
            }
            if (meteorCheck) distForMeteorMove = Math.min(dist, distForMeteorMove);
            meteorDistArr[s] = dist;
            meteorStartIdxArr[s] = meteorStartIdx;
            grounds[s] = ground;
        }

        for (int s = 0; s < S; s++) {
            int meteorDist = meteorDistArr[s] - distForMeteorMove, meteor = meteorStartIdxArr[s], ground = grounds[s];
            for (int r = R - 1; r >= 0; r--) {
                if (image[r][s] == '#') ground--;
                else if (ground != 0) ground--;
                else if (meteorDist != 0) meteorDist--;
                else if (meteor >= 0) {
                    image[r][s] = image[meteor][s];
                    meteor--;
                }
                else image[r][s] = '.';
            }
        }

        for (int r = 0; r < R; r++) {
            for (int s = 0; s < S; s++) out.append(image[r][s]);
            out.append("\n");
        }

        bw.write(out.toString());
        bw.flush();
    }
}