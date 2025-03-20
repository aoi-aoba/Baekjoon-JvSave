import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] str = new String(br.readLine()).toCharArray();
        int[] arr = new int[10];
        for(char c : str) arr[c - '0']++;
        for(int i=9; i>=0; i--)
            for(int j=0; j<arr[i]; j++) bw.write(String.valueOf(i));

        bw.flush();
        bw.close();
        br.close();
    }
}