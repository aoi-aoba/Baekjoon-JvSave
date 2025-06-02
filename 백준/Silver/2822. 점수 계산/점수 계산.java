import java.io.*;
import java.util.*;

public class Main {
    public static class Quiz {
        int quizNum, score;
        public Quiz(int quizNum, int score) {
            this.quizNum = quizNum;
            this.score = score;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        ArrayList<Quiz> quizList = new ArrayList<>();
        int finalScore = 0;

        for (int i = 0; i < 8; i++) {
            int tempScore = Integer.parseInt(br.readLine());
            finalScore += tempScore;
            quizList.add(new Quiz(i, tempScore));
        }

        quizList.sort(new Comparator<Quiz>() {
            @Override
            public int compare(Quiz q1, Quiz q2) {
                return Integer.compare(q1.score, q2.score);
            }
        });

        for (int i = 0; i < 3; i++) finalScore -= quizList.get(i).score;
        result.append(finalScore).append("\n");

        boolean[] isContains = new boolean[9];
        for (int i = 3; i < 8; i++) isContains[quizList.get(i).quizNum + 1] = true;
        for (int i = 1; i < 9; i++) if (isContains[i]) result.append(i).append(" ");
        System.out.println(result);
    }
}