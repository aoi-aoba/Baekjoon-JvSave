import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), aScore = 0, bScore = 0;
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int aNow = Integer.parseInt(st.nextToken());
            int bNow = Integer.parseInt(st.nextToken());
            if(aNow > bNow) aScore++;
            else if(bNow > aNow) bScore++;
        }
        System.out.println(aScore + " " + bScore);
        br.close();
    }
}