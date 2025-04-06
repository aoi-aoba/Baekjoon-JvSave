import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            if(str.equals("*")) break;

            boolean[] alphabet = new boolean[26];
            char[] strToArray = str.toCharArray();
            for(char ch : strToArray) {
                if(ch == ' ') continue;
                else alphabet[ch - 'a'] = true;
            }

            boolean isPangram = true;
            for(int i=0; i<alphabet.length; i++) if(!alphabet[i]) isPangram = false;
            sb.append(isPangram ? "Y\n" : "N\n");
        }

        System.out.print(sb);
        br.close();
    }
}