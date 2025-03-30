import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int plusOne = 0;
        for (int i = str.length-1; i > 0; i--) {
            int target = str[i] - '0';
            if (plusOne != 0) {
                target++;
                plusOne = 0;
            }
            if (target > 4) plusOne++;
            str[i] = '0';
        }
        if (plusOne != 0) {
            if(str[0] == '9') {
                System.out.print(1);
                str[0] = '0';
            } else str[0] = (char)(str[0] + 1);
        }
        for(char c : str) System.out.print(c);
        br.close();
    }
}