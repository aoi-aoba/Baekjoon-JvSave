import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println((str.charAt(0) == 'E' ? "I" : "E") + (str.charAt(1) == 'N' ? "S" : "N") + (str.charAt(2) == 'T' ? "F" : "T") + (str.charAt(3) == 'P' ? "J" : "P"));
    }
}