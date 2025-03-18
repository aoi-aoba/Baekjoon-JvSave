import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0; i<str.length(); i++) {
            if((int)str.charAt(i) <= 67) System.out.print((char)(str.charAt(i)+25-2));
            else System.out.print((char)(str.charAt(i)-3));
        }
        br.close();
    }
}