import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] gandalf = {1, 2, 3, 3, 4, 10},
                thauron = {1, 2, 2, 2, 3, 5, 10};
        int T = Integer.parseInt(br.readLine());
        for(int i=1; i<=T; i++) {
            int ganScore = 0, thaScore = 0;
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<6; j++)
                ganScore += gandalf[j] * Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<7; j++)
                thaScore += thauron[j] * Integer.parseInt(st.nextToken());
            sb.append("Battle ").append(i).append(": ");
            if(ganScore > thaScore) sb.append("Good triumphs over Evil");
            else if(ganScore < thaScore) sb.append("Evil eradicates all trace of Good");
            else sb.append("No victor on this battle field");
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}