import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] WUnivScore = new int[10];
        for(int i=0; i<10; i++) WUnivScore[i] = Integer.parseInt(br.readLine());
        int[] KUnivScore = new int[10];
        for(int i=0; i<10; i++) KUnivScore[i] = Integer.parseInt(br.readLine());
        Arrays.sort(WUnivScore);
        Arrays.sort(KUnivScore);
        System.out.print(WUnivScore[7] + WUnivScore[8] + WUnivScore[9] + " ");
        System.out.println(KUnivScore[7] + KUnivScore[8] + KUnivScore[9]);
        br.close();
    }
}