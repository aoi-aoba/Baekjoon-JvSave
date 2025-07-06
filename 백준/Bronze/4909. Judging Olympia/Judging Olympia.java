import java.io.*;
import java.util.*;

public class Main {
    public static int[] grades = new int[6];
    public static boolean isAllZero() {
        int cnt = 0;
        for (int i = 0; i < 6; i++)
            if (grades[i] == 0) cnt++;
        return cnt == 6;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 6; i++) grades[i] = Integer.parseInt(st.nextToken());
            if (isAllZero()) break;
            Arrays.sort(grades);
            double sum = 0;
            for (int i = 1; i < 5; i++) sum += grades[i];
            sum /= 4.0;
            if (sum == (int) sum) System.out.println((int) sum);
            else System.out.println(sum);
        }
    }
}