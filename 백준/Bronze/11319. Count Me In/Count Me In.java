import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            char[] str = br.readLine().toCharArray();
            int vowel = 0, cons = 0;
            for (char c : str) {
                if (c == ' ') continue;
                c = Character.toLowerCase(c);
                if (c == 'a' || c == 'i' || c == 'u' || c == 'o' || c == 'e') vowel++;
                else cons++;
            }
            sb.append(cons).append(" ").append(vowel).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}