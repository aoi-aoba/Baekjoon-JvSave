import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            char[] str = br.readLine().toLowerCase().toCharArray();
            if(str[0] == '#') break;
            char target = str[0];
            int cnt = -1;
            for(char c : str) if(c == target) cnt++;
            System.out.println(target + " " + cnt);
        }
        br.close();
    }
}