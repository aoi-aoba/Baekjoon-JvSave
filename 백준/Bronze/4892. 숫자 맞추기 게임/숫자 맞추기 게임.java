import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N_0 = 0, N_1 = 0, N_4 = 0, i = 0;
        while(true) {
            i++;
            N_0 = Integer.parseInt(br.readLine());
            if(N_0 == 0) break;
            N_1 = N_0 * 3;
            if(N_1 % 2 == 0) {
                N_4 = (N_1 / 2) * 3 / 9;
                System.out.println(i + ". even " + N_4);
            } else {
                N_4 = (N_1 + 1) / 2 * 3 / 9;
                System.out.println(i + ". odd " + N_4);
            }
        }
        br.close();
    }
}