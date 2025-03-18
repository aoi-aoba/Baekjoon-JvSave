import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int result = 0;
            if(first == 0) result += 0;
            else if(first == 1) result += 5000000;
            else if(first <= 3) result += 3000000;
            else if(first <= 6) result += 2000000;
            else if(first <= 10) result += 500000;
            else if(first <= 15) result += 300000;
            else if(first <= 21) result += 100000;
            if(second == 0) result += 0;
            else if(second == 1) result += 5120000;
            else if(second <= 3) result += 2560000;
            else if(second <= 7) result += 1280000;
            else if(second <= 15) result += 640000;
            else if(second <= 31) result += 320000;
            System.out.println(result);
        }
        br.close();
    }
}