import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bonusScore = 0, finalScore = 0, problemNow = 1;
        int problemNum = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();
        for (; problemNow <= problemNum; problemNow++) {
            if(str[problemNow - 1] == 'O') {
                finalScore += bonusScore + problemNow;
                bonusScore++;
            } else bonusScore = 0;
        }
        System.out.println(finalScore);
        br.close();
    }
}