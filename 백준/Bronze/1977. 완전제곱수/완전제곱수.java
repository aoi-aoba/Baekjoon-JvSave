import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine()), N = Integer.parseInt(br.readLine());
        int min = 10000, sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i * i >= M && i * i <= N) {
                if(min > i * i) min = i * i;
                sum += i * i;
            } else if(i * i > N) break;
        }
        if(sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
        br.close();
    }
}