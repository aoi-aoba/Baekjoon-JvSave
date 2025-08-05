import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] hiarc = new int[5];
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();

        for (int i = 0; i < N; i++) {
            switch (input.charAt(i)) {
                case 'H' -> hiarc[0]++;
                case 'I' -> hiarc[1]++;
                case 'A' -> hiarc[2]++;
                case 'R' -> hiarc[3]++;
                case 'C' -> hiarc[4]++;
            }
        }

        int result = Integer.MAX_VALUE;
        for (int temp : hiarc) result = Math.min(result, temp);


        bw.write(String.valueOf(result));
        bw.flush();
    }
}