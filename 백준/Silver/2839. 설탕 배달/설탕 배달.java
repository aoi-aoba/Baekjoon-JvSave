import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int five = N/5, res = 5000;

        for(int i=0; i<=five; i++) {
            int nExFive = N - (i * 5);
            if(nExFive % 3 == 0) res = Math.min(res, i+(nExFive/3));
        }

        System.out.println(res == 5000 ? -1 : res);
        br.close();
    }
}