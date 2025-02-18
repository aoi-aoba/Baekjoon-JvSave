import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "WelcomeToSMUPC";
        int N = Integer.parseInt(br.readLine()), pos = N % 14;
        if(pos == 0) System.out.println(str.charAt(13));
        else System.out.println(str.charAt(pos-1));
    }
}