import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        char[] remove = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
        for (char c : str) {
            boolean isCharContained = false;
            for (char d : remove) {
                if (c == d) {
                    isCharContained = true;
                    break;
                }
            }
            if(!isCharContained) System.out.print(c);
        }
        br.close();
    }
}