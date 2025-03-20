import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), valOfFive = 0;
        while(N > 0) {
            if(N % 5 != 0) N -= (N % 5);
            else if(N % 125 == 0) {
                N -= 5;
                valOfFive += 3;
            } else if(N % 25 == 0) {
                N -= 5;
                valOfFive += 2;
            } else {
                N-= 5;
                valOfFive++;
            }
        }
        System.out.println(valOfFive);
        br.close();
    }
}