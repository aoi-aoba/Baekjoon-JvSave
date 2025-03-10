import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String temp = br.readLine();
            if(temp == null) break;
            char[] str = temp.toCharArray();
            int[] arr = {0, 0, 0, 0}; // 소문자, 대문자, 숫자, 공백 순서
            for(char c : str) {
                if(c >= 'a' && c <= 'z') arr[0]++;
                else if(c >= 'A' && c <= 'Z') arr[1]++;
                else if(c >= '0' && c <= '9') arr[2]++;
                else arr[3]++;
            }
            for(int i : arr) System.out.print(i + " ");
            System.out.println();
        }
        br.close();
    }
}