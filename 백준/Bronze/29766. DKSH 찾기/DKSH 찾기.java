import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int numOfExists = 0;
        for(int i = 0; i < str.length() - 3; i++) {
            if(str.charAt(i) == 'D' && str.charAt(i + 1) == 'K' && str.charAt(i + 2) == 'S' && str.charAt(i + 3) == 'H') {
                numOfExists++;
            }
        }
        System.out.println(numOfExists);
        br.close();
    }
}