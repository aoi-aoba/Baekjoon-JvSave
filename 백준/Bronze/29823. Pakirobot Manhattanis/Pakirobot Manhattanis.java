import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int NS = 0, WE = 0;
        String str = br.readLine();
        for(int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case 'N' -> NS++;
                case 'S' -> NS--;
                case 'W' -> WE++;
                case 'E' -> WE--;
            }
        }
        System.out.println(Math.abs(NS) + Math.abs(WE));
    }
}