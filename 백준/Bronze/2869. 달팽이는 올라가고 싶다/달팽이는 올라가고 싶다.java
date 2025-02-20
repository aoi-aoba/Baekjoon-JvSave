import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int day = 1;
        v -= a;
        if(v > a-b) {
            day += v/(a-b);
            if(v % (a-b) != 0) day++;
        } else if(v > 0) day++;
        System.out.println(day);
    }
}