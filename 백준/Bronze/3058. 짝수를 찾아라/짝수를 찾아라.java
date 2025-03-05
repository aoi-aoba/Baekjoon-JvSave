import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int min = 101, sumOfEvens = 0;
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<7; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if(temp % 2 == 0) {
                    min = Math.min(temp, min);
                    sumOfEvens += temp;
                }
            }
            System.out.println(sumOfEvens + " " + min);
        }

        br.close();
    }
}