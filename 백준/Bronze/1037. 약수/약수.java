import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int realDivisorNum = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0; i<realDivisorNum; i++) {
            int temp = Integer.parseInt(st.nextToken());
            min = Math.min(temp, min);
            max = Math.max(temp, max);
        }
        System.out.println(min*max);
        br.close();
    }
}