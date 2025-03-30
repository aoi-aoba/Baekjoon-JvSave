import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        br.close();
        int strToInt = 0;
        for(char c : str) {
            if(c >= 'a' && c <= 'z') strToInt += c - 'a' + 1;
            else strToInt += c - 'A' + 27;
        }
        for(int i = 2; i <= Math.sqrt(strToInt); i++) {
            if(strToInt % i == 0) {
                System.out.println("It is not a prime word.");
                return;
            }
        }
        System.out.println("It is a prime word.");
    }
}