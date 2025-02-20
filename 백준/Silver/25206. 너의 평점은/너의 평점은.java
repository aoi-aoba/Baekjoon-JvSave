import java.io.*;
import java.util.*;

public class Main {
    public static double changeFunction(String grade) {
        double res = 0;
        if(grade.charAt(0) == 'A') res += 4.0;
        else if(grade.charAt(0) == 'B') res += 3.0;
        else if(grade.charAt(0) == 'C') res += 2.0;
        else if(grade.charAt(0) == 'D') res += 1.0;
        if(grade.charAt(0) != 'F')
            if(grade.charAt(1) == '+') res += 0.5;
        return res;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, gradeInEng;
        double scoreVal = 0, gradeInVal = 0, allscore = 0, allgradeVal = 0;
        for(int i=0; i<20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            scoreVal = Double.parseDouble(st.nextToken());
            gradeInEng = st.nextToken();
            if(!gradeInEng.equals("P")) {
                gradeInVal = changeFunction(gradeInEng);
                allscore += scoreVal;
                allgradeVal += scoreVal * gradeInVal;
            }
        }
        System.out.println(allgradeVal / allscore);
    }
}