import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        if(a >= -32768 && a <= 32767) System.out.println("short");
        else if(a >= -2147483648 && a <= 2147483647) System.out.println("int");
        else System.out.println("long long");
        br.close();
    }
}