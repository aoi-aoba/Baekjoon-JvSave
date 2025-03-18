import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            String K = br.readLine();
            if((K.charAt(K.length()-1) - '0') % 2 == 0) System.out.println("even");
            else System.out.println("odd");
        }
        br.close();
    }
}