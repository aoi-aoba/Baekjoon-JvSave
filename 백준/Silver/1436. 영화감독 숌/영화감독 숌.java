import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 666, N = Integer.parseInt(br.readLine()), num = 1;
        while(num != N) {
            i++;
            if(String.valueOf(i).contains("666")) num++;
        }
        System.out.println(i);
        br.close();
    }
}