import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.startsWith("0x")) {
            str = str.replace("0x", "");
            System.out.println(Integer.parseInt(str, 16));
        } else if(str.startsWith("0")) System.out.println(Integer.parseInt(str, 8));
        else System.out.println(Integer.parseInt(str));
    }
}
