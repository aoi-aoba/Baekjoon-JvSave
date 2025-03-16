import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int a = 0, b = 0;
        char[] arr = br.readLine().toCharArray();
        for(char c : arr) {
            if(c == 'A') a++;
            else b++;
        }
        System.out.println((a > b) ? "A" : (a < b) ? "B" : "Tie");
        br.close();
    }
}