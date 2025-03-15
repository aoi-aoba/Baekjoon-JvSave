import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while(true) {
            str = new StringBuilder(br.readLine()).reverse().toString();
            if(str.equals("#")) break;
            str = str.replace('-', '0').replace('\\', '1')
                    .replace('(', '2').replace('@', '3')
                    .replace('?', '4').replace('>', '5')
                    .replace('&', '6').replace('%', '7')
                    .replace('/', '8');
            long res = 0;
            for(int i=0; i<str.length(); i++) {
                int temp = str.charAt(i) - '0';
                if(temp == 8) temp = -1;
                for(int j=0; j<i; j++) temp *= 8;
                res += temp;
            }
            System.out.println(res);
        }
        br.close();
    }
}