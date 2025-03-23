import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = Integer.toBinaryString(Integer.parseInt(br.readLine())).toCharArray();
        int sum = 0;
        for(char c : arr) sum += c - '0';
        if(sum == 1) System.out.println(1);
        else System.out.println(0);
        br.close();
    }
}