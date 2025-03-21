import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), res = 0;
        for(int i=1; i<= N; i++) {
            char[] arr = String.valueOf(i).toCharArray();
            for(char c : arr) if(c == '3' || c == '6' || c == '9') res++;
        }
        System.out.println(res);
        br.close();
    }
}