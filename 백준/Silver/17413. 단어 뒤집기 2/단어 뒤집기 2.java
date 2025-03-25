import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        Stack<String> wordLetterStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                while (!wordLetterStack.isEmpty())
                    sb.append(wordLetterStack.pop());
                while (str.charAt(i) != '>') {
                    sb.append(str.charAt(i));
                    i++;
                }
                sb.append(">");
            } else {
                if (str.charAt(i) != ' ')
                    wordLetterStack.push(String.valueOf(str.charAt(i)));
                if (str.charAt(i) == ' ' || i == str.length() - 1) {
                    while (!wordLetterStack.isEmpty())
                        sb.append(wordLetterStack.pop());
                    sb.append(" ");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}