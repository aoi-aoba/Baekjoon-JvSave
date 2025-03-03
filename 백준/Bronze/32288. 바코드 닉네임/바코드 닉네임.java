import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'I'){
                answer+= "i";
            }else {
                answer+= "L";
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}