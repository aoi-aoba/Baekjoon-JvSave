import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), yes = 0, no = 0, wtf = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp == 1) yes++;
            else if (temp == 0) wtf++;
            else no++;
        }
        if (wtf >= (double) N / 2) System.out.println("INVALID");
        else if (yes > no) System.out.println("APPROVED");
        else System.out.println("REJECTED");
    }
}