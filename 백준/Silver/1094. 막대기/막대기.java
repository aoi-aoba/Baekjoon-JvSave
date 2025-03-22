import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), res = 0;
        while(N > 0) {
            if(N == 64) N -= 64;
            else if(N >= 32) N -= 32;
            else if(N >= 16) N -= 16;
            else if(N >= 8) N -= 8;
            else if(N >= 4) N -= 4;
            else if(N >= 2) N -= 2;
            else N--;
            res++;
        }
        System.out.println(res);
        br.close();
    }
}