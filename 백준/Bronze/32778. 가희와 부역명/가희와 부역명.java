import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        String str = input.readLine();
        boolean hasSubName = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                output.append("\n");
                hasSubName = true;
            }
            else if (str.charAt(i) == ')') break;
            else output.append(str.charAt(i));
        }
        if (!hasSubName) output.append("\n-");
        System.out.print(output);
    }
}