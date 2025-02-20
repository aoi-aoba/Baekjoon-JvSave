import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] str = new String[5];
        int[] strlen = new int[5];
        int maxlen = 0;
        for(int i=0; i<5; i++) {
            str[i] = br.readLine();
            strlen[i] = str[i].length() - 1;
            if(maxlen < strlen[i]) maxlen = strlen[i];
        }
        for(int i=0; i<=maxlen; i++) {
            for(int j=0; j<5; j++) {
                if(strlen[j] >= i) sb.append(str[j].charAt(i));
            }
        }
        System.out.println(sb);
    }
}