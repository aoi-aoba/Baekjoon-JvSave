import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.equals("(1)")) System.out.println(0);
        else if (str.equals(")1(")) System.out.println(2);
        else System.out.println(1);
    }
}