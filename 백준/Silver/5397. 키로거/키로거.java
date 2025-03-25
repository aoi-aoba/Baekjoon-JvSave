import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++) {
            StringBuilder sb = new StringBuilder();
            String str = br.readLine();
            Stack<String> res = new Stack<>(), left = new Stack<>();
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                switch(ch) {
                    case '<' : if(!res.isEmpty()) left.push(res.pop()); break;
                    case '>' : if(!left.isEmpty()) res.push(left.pop()); break;
                    case '-' : if(!res.isEmpty()) res.pop();break;
                    default: res.push(String.valueOf(ch)); break;
                }
            }
            while(!left.isEmpty()) res.push(left.pop());
            while(!res.isEmpty()) sb.append(res.pop());
            result.append(sb.reverse()).append("\n");
        }
        System.out.print(result);
        br.close();
    }
}