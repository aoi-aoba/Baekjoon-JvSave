import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        if(str.charAt(str.length()-1) == 'G')
            for(int i=0; i<str.length()-1; i++) System.out.print(str.charAt(i));
        else if(str.charAt(str.length()-1) != 'G')
            System.out.print(str + "G");
        System.out.println();
        br.close();
    }
}