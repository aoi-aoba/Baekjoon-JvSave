import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int valA = 0, valB = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'A') valA++;
            else valB++;
        }
        System.out.println(valA + " : " + valB);
        br.close();
    }
}