import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int res = 0;
        for(char c : str) {
            switch (c) {
                case 'A', 'a', 'b', 'D', 'd', 'e', 'g', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', '@' -> res++;
                case 'B' -> res += 2;
            }
        }
        System.out.println(res);
    }
}
