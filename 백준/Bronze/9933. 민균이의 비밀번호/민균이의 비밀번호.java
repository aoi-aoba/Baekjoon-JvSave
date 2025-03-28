import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i = 0; i < N; i++) arr[i] = br.readLine();
        br.close();
        for(int i = 0; i < N-1; i++) {
            sb = new StringBuilder(arr[i]).reverse();
            for(int j = i; j < N; j++)
                if(arr[j].contentEquals(sb))
                    System.out.println(arr[j].length() + " " + arr[j].charAt(arr[j].length()/2));
        }
    }
}