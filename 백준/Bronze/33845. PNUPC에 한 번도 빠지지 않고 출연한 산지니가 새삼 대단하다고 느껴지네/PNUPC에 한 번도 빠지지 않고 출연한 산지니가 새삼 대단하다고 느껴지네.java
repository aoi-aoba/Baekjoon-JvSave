import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Character> sanjineeSet = new HashSet<>();
        char[] id = br.readLine().toCharArray();
        for (char ch : id) sanjineeSet.add(ch);
        char[] target = br.readLine().toCharArray();
        for (char ch : target) if (!sanjineeSet.contains(ch)) System.out.print(ch);
    }
}