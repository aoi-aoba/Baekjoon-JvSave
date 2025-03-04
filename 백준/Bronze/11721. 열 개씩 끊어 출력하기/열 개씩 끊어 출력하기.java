import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for(int i=1; i<=str.length(); i++) {
            sb.append(str.charAt(i-1));
            if(i % 10 == 0) sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}