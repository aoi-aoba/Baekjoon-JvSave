import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean isChronological = true;
        int prevScoreA = -1, prevScoreB = -1;

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int scoreA = Integer.parseInt(st.nextToken());
            int scoreB = Integer.parseInt(st.nextToken());
            if(scoreA < prevScoreA || scoreB < prevScoreB || (scoreA == prevScoreA && scoreB == prevScoreB))
                isChronological = false;
            prevScoreA = scoreA;
            prevScoreB = scoreB;
        }

        System.out.println(isChronological ? "yes" : "no");
        br.close();
    }
}