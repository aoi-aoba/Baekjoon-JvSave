import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[3];
        for(int i=0; i<3; i++) {
            String str = br.readLine();
            switch(str.charAt(0)) {
                case 'l' -> arr[0] = true;
                case 'k' -> arr[1] = true;
                case 'p' -> arr[2] = true;
            }
        }
        if(arr[0] && arr[1] && arr[2]) System.out.println("GLOBAL");
        else System.out.println("PONIX");
        br.close();
    }
}