import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), res = 0;
        String NtoBinary = Integer.toBinaryString(N);
        for(int i=0; i<NtoBinary.length(); i++) if(NtoBinary.charAt(i) == '1') res++;
        System.out.println(res);
        br.close();
    }
}