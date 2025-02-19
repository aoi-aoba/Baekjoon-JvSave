import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), res = 0;
        String s = br.readLine();
        for(int i=0; i<N; i++) {
            if(s.charAt(i) == 'a') res++;
            else if(s.charAt(i) == 'i') res++;
            else if(s.charAt(i) == 'u') res++;
            else if(s.charAt(i) == 'o') res++;
            else if(s.charAt(i) == 'e') res++;
        }
        System.out.println(res);
    }
}