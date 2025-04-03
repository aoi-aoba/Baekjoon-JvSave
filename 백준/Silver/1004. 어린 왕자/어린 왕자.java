import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer positions = new StringTokenizer(br.readLine());
            int start_x = Integer.parseInt(positions.nextToken()), start_y = Integer.parseInt(positions.nextToken());
            int arrive_x = Integer.parseInt(positions.nextToken()), arrive_y = Integer.parseInt(positions.nextToken());
            int result = 0;

            int verseNum = Integer.parseInt(br.readLine());
            for(int i=0; i<verseNum; i++) {
                StringTokenizer verseRange = new StringTokenizer(br.readLine());
                int verseCenterX = Integer.parseInt(verseRange.nextToken());
                int verseCenterY = Integer.parseInt(verseRange.nextToken());
                int verseRadius = Integer.parseInt(verseRange.nextToken());

                double startCenterDist = Math.sqrt(Math.pow(verseCenterX-start_x, 2) + Math.pow(verseCenterY-start_y, 2));
                double endCenterDist = Math.sqrt(Math.pow(verseCenterX-arrive_x, 2) + Math.pow(verseCenterY-arrive_y, 2));

                boolean isStartInVerse = (startCenterDist < verseRadius);
                boolean isArrivalInVerse = (endCenterDist < verseRadius);

                if (isStartInVerse ^ isArrivalInVerse) {
                   if (isStartInVerse) result++;
                   if (isArrivalInVerse) result++;
                }
            }

            sb.append(result).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}