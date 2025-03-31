import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        switch(str.length() % 3) {
            case 1 -> str = "00" + str;
            case 2 -> str = "0" + str;
        }
        for(int i = 0; i < str.length(); i+=3) {
            int val = -1;
            String temp = String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i+1)) + String.valueOf(str.charAt(i+2));
            switch(temp) {
                case "000" -> val = 0;
                case "001" -> val = 1;
                case "010" -> val = 2;
                case "011" -> val = 3;
                case "100" -> val = 4;
                case "101" -> val = 5;
                case "110" -> val = 6;
                case "111" -> val = 7;
            }
            System.out.print(val);
        }
    }
}