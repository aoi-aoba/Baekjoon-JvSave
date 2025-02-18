import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        long remainder = 0;
        for(int i=0; i<str.length(); i++)
            remainder = (remainder * 10 + (str.charAt(i) - '0')) % 20000303;
        System.out.println(remainder);
    }
}