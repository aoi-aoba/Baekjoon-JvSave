import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        Stack<Integer> iron = new Stack<>();
        int res = 0;
        char prevChar = ' ';
        for(char c : arr) {
            if(c == '(') iron.push(1);
            else if(c == ')') {
                iron.pop();
                if(prevChar == '(') res += iron.size();
                else res += 1;
            }
            prevChar = c;
        }
        br.close();
        System.out.println(res);
    }
}