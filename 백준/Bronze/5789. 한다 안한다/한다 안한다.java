import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String str = br.readLine();
            int N = str.length();
            if(str.charAt(N/2) == str.charAt(N/2-1)) System.out.println("Do-it");
            else System.out.println("Do-it-Not");
        }
        br.close();
    }
}