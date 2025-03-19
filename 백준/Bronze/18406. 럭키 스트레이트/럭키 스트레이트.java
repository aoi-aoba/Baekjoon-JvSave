import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int forwardSum = 0, backwardSum = 0;
        for(int i=0; i<str.length()/2; i++) forwardSum += (str.charAt(i) - '0');
        for(int i=str.length()/2; i<str.length(); i++) backwardSum += (str.charAt(i) - '0');
        System.out.println(forwardSum == backwardSum ? "LUCKY" : "READY");
        br.close();
    }
}