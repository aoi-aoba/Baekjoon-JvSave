import java.util.*;
import java.io.*;

public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = -1, min = 30;
        boolean[] checked = new boolean[30];
        for(int i=0; i<30; i++) checked[i] = false;

        for(int i=0; i<28; i++) {
            int temp = Integer.parseInt(st.nextToken());
            checked[temp-1] = true;
            if(i != 27) st = new StringTokenizer(br.readLine());
        }

        for(int i=0; i<30; i++) {
            if(!checked[i]) {
                if(i+1 < min) min = i+1;
                if(i+1 > max) max = i+1;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}