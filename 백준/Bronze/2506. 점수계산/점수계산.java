import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int streak = 0, score = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++) {
            int isCorrect = Integer.parseInt(st.nextToken());
            if(isCorrect > 0) {
                score += streak + 1;
                streak++;
            } else {
                streak = 0;
            }
        }

        System.out.println(score);
        br.close();
    }
}