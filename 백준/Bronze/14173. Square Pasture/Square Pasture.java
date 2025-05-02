import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minPosX = 11, minPosY = 11, maxPosX = -1, maxPosY = -1, maxLength = 0;
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                int posX = Integer.parseInt(st.nextToken()), posY = Integer.parseInt(st.nextToken());
                minPosX = Math.min(posX, minPosX);
                maxPosX = Math.max(posX, maxPosX);
                minPosY = Math.min(posY, minPosY);
                maxPosY = Math.max(posY, maxPosY);
            }
        }
        maxLength = Math.max(maxPosX-minPosX, maxPosY-minPosY);
        System.out.println(maxLength * maxLength);
        br.close();
    }
}