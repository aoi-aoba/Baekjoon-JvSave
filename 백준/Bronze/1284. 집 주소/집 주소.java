import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String str = br.readLine();
            if(str.equals("0")) break;
            int length = 0;
            for(int i=0; i<str.length(); i++) {
                switch (Integer.parseInt(String.valueOf(str.charAt(i)))) {
                    case 1 -> length += 2;
                    case 0 -> length += 4;
                    default -> length += 3;
                }
                length++;
            }
            System.out.println(length+1);
        }
        br.close();
    }
}