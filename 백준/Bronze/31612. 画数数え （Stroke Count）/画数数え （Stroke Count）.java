import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), sum = 0;
        char[] arr = br.readLine().toCharArray();
        for(char c : arr) {
            if(c == 'j' || c == 'i') sum += 2;
            else sum += 1;
        }
        System.out.println(sum);
        br.close();
    }
}