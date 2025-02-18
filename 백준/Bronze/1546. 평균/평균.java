import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            score[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(score);
        int M = score[N - 1];
        double newScoreSum = 0;
        for (int i = 0; i < N; i++)
            newScoreSum += score[i] / (double)M * 100;
        System.out.println(newScoreSum/N);
    }
}