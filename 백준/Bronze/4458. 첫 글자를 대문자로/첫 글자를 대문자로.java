import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            char[] string = br.readLine().toCharArray();
            for(int j = 0; j < string.length; j++) {
                if(j == 0 && string[j] >= 'a' && string[j] <= 'z')
                    sb.append((char)(string[j] + ('A' - 'a')));
                else sb.append(string[j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}