import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), a = 0;
        for(int i=0; i<n; i++)
            a += Integer.parseInt(br.readLine());
        if(n / 2.0 > a) System.out.println("Junhee is not cute!");
        else System.out.println("Junhee is cute!");
        br.close();
    }
}