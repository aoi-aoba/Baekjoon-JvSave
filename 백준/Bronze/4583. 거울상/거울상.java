import java.io.*;
import java.util.*;

public class Main {
    public static String reversed(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        return rev;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals("#")) break;
            boolean end = true;
            StringBuilder temp = new StringBuilder();
            for (char ch : reversed(str).toCharArray()) {
                switch (ch) {
                    case 'b' -> temp.append('d');
                    case 'd' -> temp.append('b');
                    case 'p' -> temp.append('q');
                    case 'q' -> temp.append('p');
                    case 'i' -> temp.append('i');
                    case 'o' -> temp.append('o');
                    case 'v' -> temp.append('v');
                    case 'w' -> temp.append('w');
                    case 'x' -> temp.append('x');
                    default -> end = false;
                }
                if (!end) break;
            }
            sb.append(end ? temp.toString() + "\n" : "INVALID\n");
        }

        System.out.print(sb);
    }
}