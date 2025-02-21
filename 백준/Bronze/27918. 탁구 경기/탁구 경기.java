import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt(), score_d = 0, score_p = 0;
        for (int i = 0; i < N; i++) {
            if (sc.next().equals("D")) score_d++;
            else score_p++;
            if(Math.abs(score_d - score_p) == 2 && sb.length() == 0)
                sb.append(score_d).append(":").append(score_p);
        }
        if(sb.length() == 0) sb.append(score_d).append(":").append(score_p);
        System.out.println(sb);
    }
}