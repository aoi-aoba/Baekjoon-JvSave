import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++) {
            String str = br.readLine();
            int result = 1;
            char ch = str.charAt(0);
            int temp_result = 1;
            for(int j = 1; j < str.length(); j++) {
                if(str.charAt(j) == ch) { // 이전 문자열과 같은 문자열
                    temp_result++;
                } else { // 다른 문자열인 경우
                    ch = str.charAt(j);
                    temp_result = 1;
                } if(temp_result >= result) {
                    result = temp_result;
                }
            }
            System.out.println(result);
        }
        br.close();
    }
}