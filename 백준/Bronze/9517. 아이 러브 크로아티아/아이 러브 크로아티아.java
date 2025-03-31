import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numHasBomb = Integer.parseInt(br.readLine()), questions = Integer.parseInt(br.readLine()), bombLimitTime = 210;
        boolean bombExplode = false;
        for(int i=0; i<questions; i++) {
            if(!bombExplode) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int answerTime = Integer.parseInt(st.nextToken());
                boolean correctAns = (st.nextToken().charAt(0) == 'T');
                if(correctAns && bombLimitTime - answerTime > 0) {
                    bombLimitTime -= answerTime;
                    numHasBomb++;
                    if(numHasBomb > 8) numHasBomb -= 8;
                } else if(!correctAns && bombLimitTime - answerTime > 0) {
                    bombLimitTime -= answerTime;
                } else bombExplode = true;
            } else br.readLine();
        }
        System.out.println(numHasBomb);
        br.close();
    }
}