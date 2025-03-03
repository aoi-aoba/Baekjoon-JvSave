import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.print(str.charAt(0));
        char prev = ' ';
        for(int i=1; i<str.length(); i++) {
            prev = str.charAt(i-1);
            if(str.charAt(i) != prev) System.out.print(str.charAt(i));
        }
    }
}