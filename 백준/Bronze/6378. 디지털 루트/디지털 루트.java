import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String str = br.readLine();
            if(str.equals("0")) break;
            else while(str.length() > 1)
                str = digitalRoot(str);
            System.out.println(str);
        }
        br.close();
    }
    public static String digitalRoot(String value) {
        int result = 0;
        for(int i=0; i<value.length(); i++) {
            result += value.charAt(i) - '0';
        }
        return String.valueOf(result);
    }
}