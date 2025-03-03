import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()), N = 0;
        for(int i=0; i<T; i++) {
            String str = br.readLine();
            if(str.contains("OI") || str.contains("01")) N++;
        }
        System.out.println(N);
        br.close();
    }
}