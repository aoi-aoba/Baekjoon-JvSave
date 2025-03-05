import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            StringBuffer sb = new StringBuffer(Integer.toBinaryString(n)).reverse();
            for(int j=0; j<sb.length(); j++) {
                if(sb.charAt(j) == '1') System.out.print(j + " ");
            }
            System.out.println();
        }
        br.close();
    }
}