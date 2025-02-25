import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int pScore = 0, eScore = 0;
        int pAway = 0, eAway = 0;

        st = new StringTokenizer(br.readLine());
        pScore += Integer.parseInt(st.nextToken());
        eScore += Integer.parseInt(st.nextToken());
        eAway = eScore;

        st = new StringTokenizer(br.readLine());
        eScore += Integer.parseInt(st.nextToken());
        pAway = Integer.parseInt(st.nextToken());
        pScore += pAway;

        if(pScore != eScore)
            System.out.println((pScore > eScore) ? "Persepolis" : "Esteghlal");
        else if(pAway != eAway)
            System.out.println((pAway > eAway) ? "Persepolis" : "Esteghlal");
        else System.out.println("Penalty");
        br.close();
    }
}