import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String str1 = br.readLine();
            String str2 = br.readLine();
            int res = 0;
            for(int j=0; j<str1.length(); j++) {
                if(str1.charAt(j) != str2.charAt(j))
                    res++;
            }
            System.out.println("Hamming distance is " + res + ".");
        }
        br.close();
    }
}