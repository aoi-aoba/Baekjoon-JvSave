import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int height = 0;
        char prev = ' ', now = ' ';
        for(char c : str) {
            now = c;
            height += (prev != now) ? 10 : 5;
            prev = now;
        }
        System.out.println(height);
        br.close();
    }
}