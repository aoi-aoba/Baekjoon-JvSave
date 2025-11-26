import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            char[] str = br.readLine().toCharArray();
            int cnt = 0;
            for (int i = 0; i <= str.length-3; i++)
                if (str[i] == str[i+2] && str[i] == 'W' && str[i+1] == 'O') cnt++;
            System.out.println(cnt);
        }
    }
}