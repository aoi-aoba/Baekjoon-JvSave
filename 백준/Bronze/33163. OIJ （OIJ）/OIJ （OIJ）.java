import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for(int i=0; i<n; i++) {
            if(str.charAt(i) == 'J') sb.append("O");
            else if(str.charAt(i) == 'O') sb.append("I");
            else if(str.charAt(i) == 'I') sb.append("J");
        }

        System.out.println(sb);

        br.close();
    }
}