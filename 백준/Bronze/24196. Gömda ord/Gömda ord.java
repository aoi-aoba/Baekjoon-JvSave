import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int i = 0;
        do {
            sb.append(str.charAt(i));
            int move = str.charAt(i) - 'A' + 1;
            i += move;
        } while (i < str.length());
        System.out.println(sb);
        br.close();
    }
}