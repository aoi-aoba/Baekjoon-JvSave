import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder(st.nextToken());
            String str1 = sb.reverse().toString();
            sb = new StringBuilder(st.nextToken());
            String str2 = sb.reverse().toString();

            int str1Size = str1.length(), str2Size = str2.length();
            if(str1.equals("0") && str2.equals("0")) break;
            int carry = 0, num = 0;

            for(int i=0; i<Math.max(str1Size, str2Size); i++) {
                int n = 0, m = 0;
                if(i < Math.min(str1Size, str2Size)) {
                    n = str1.charAt(i) - '0';
                    m = str2.charAt(i) - '0';
                } else n = Math.max(str1Size, str2Size) == str1Size ? str1.charAt(i) - '0' : str2.charAt(i) - '0';
                if((n + m + num) >= 10) {
                    num = 1;
                    carry++;
                } else num = 0;
            }

            System.out.println(carry);
        }
        br.close();
    }
}