import java.io.*;
import java.util.*;

public class Main {
    public static char[] tar = {'a', 'e', 'i', 'o', 'u', 'n', 's'};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] ==  'a' || input[i] == 'i' || input[i] == 'o' || input[i] == 'u' || input[i] == 'e')
                lst.add(i + 1);
        }
        boolean endRule = false;
        for (char ch : tar) {
            if (input[input.length - 1] == ch) {
                endRule = true;
                break;
            }
        }
        if (endRule) {
            System.out.println(lst.size() >= 2 ? lst.get(lst.size() - 2) : "-1");
        } else {
            System.out.println(lst.isEmpty() ? "-1" : lst.get(lst.size() - 1));
        }
    }
}