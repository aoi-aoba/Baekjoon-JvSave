import java.io.*;
import java.util.*;

public class Main {
    public static char rot13(char c) {
        if(c >= 'A' && c <= 'Z') {
            if (c >= 'N') return (char) (c - 13);
            else return (char) (c + 13);
        } else if(c >= 'a' && c <= 'z') {
            if (c >= 'n') return (char) (c - 13);
            else return (char) (c + 13);
        } else return c;
        // 아스키 코드 기준 N과 n이 중간
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        for(int i=0; i<str.length(); i++) {
            sb.append(rot13(str.charAt(i)));
        }
        System.out.println(sb);
        br.close();
    }
}