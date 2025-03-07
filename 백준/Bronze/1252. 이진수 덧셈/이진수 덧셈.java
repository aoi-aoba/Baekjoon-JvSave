import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb1 = new StringBuilder(st.nextToken().replaceFirst("^0+", "")).reverse();
        StringBuilder sb2 = new StringBuilder(st.nextToken().replaceFirst("^0+", "")).reverse();
        StringBuilder res = new StringBuilder();

        if (sb1.length() < sb2.length()) {
            StringBuilder temp = sb1;
            sb1 = sb2;
            sb2 = temp;
        } // 더 긴 이진수 String을 앞으로 보내기

        int carry = 0;
        for(int i=0; i<sb1.length(); i++) {
            int a = sb1.charAt(i) - '0', b = 0;
            if(i<sb2.length()) b = sb2.charAt(i) - '0';
            int sum = a + b + carry;
            carry = 0;

            if(sum == 0) res.append(0);
            else if(sum == 1) res.append(1);
            else {
                carry = 1;
                res.append(sum == 2 ? 0 : 1);
            }
        }
        if(carry == 1) res.append(1);

        if(!res.toString().contains("1")) System.out.println(0);
        else System.out.println(res.reverse());
        br.close();
    }
}

/*
최대 2^81 < 2^82 = 4^42 = 8^21 < 10^21 (long 커버되지 않음)
 */