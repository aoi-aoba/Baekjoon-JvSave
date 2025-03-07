import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        if(str.equals("0")) {
            System.out.println(0);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            switch(str.charAt(i)) {
                case '1' -> sb.append(i == 0 ? "1" : "001");
                case '2' -> sb.append(i == 0 ? "10" : "010");
                case '3' -> sb.append(i == 0 ? "11" : "011");
                case '4' -> sb.append("100");
                case '5' -> sb.append("101");
                case '6' -> sb.append("110");
                case '7' -> sb.append("111");
                case '0' -> sb.append("000");
            }
        }
        System.out.println(sb);
    }
}

/*
8진수의 '길이'가 333,334를 넘지 않기 때문에
단순히 생각해도 8^333,334*7, 대략 2*10^301031
그러면 직접 8진수를 2진수로 바꾸는게 더 나을 것
한 자리에 대해 1/2/4를 쓰고 그 인지에 대해서 선택하면 1, 아니면 0
 */