import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arrInt = new int[2000001]; // -1000000을 0으로 치고, 1000000을 2000000으로 치는 것임!
        Arrays.fill(arrInt, 0);

        int N = Integer.parseInt(br.readLine());
        int max = 0, min = 1000000;

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            arrInt[temp+1000000]++;
            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }

        for (int i = min+1000000; i <= max+1000000; i++) {
            if (arrInt[i] > 0) {
                int repeat = arrInt[i];
                for (int j = 0; j < repeat; j++)
                    bw.write(i - 1000000 + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}