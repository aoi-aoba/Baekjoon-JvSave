import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        if(str.equals("1")) {
            System.out.println("NO");
            return;
        }
        int forward = 1, backward = 1;
        boolean isYujinNum = false;
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < i; j++) forward *= str.charAt(j) - '0';
            for(int j = i; j < str.length(); j++) backward *= str.charAt(j) - '0';
            if(forward == backward) isYujinNum = true;
            forward = 1;
            backward = 1;
        }
        System.out.println(isYujinNum ? "YES" : "NO");
    }
}