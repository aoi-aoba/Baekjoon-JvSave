import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = " ";
        int n = Integer.parseInt(br.readLine());
        if(n != 1 && n != 3) str = "EI";
        n = Integer.parseInt(br.readLine());
        if(n != 6 && n != 8) str = "EI";
        n = Integer.parseInt(br.readLine());
        if(n != 2 && n != 5) str = "EI";
        if(!str.equals("EI")) str = "JAH";
        System.out.println(str);
        br.close();
    }
}