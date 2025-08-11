import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++)
            arr[str.charAt(i) - 'a']++;

        boolean hasOdd = false, hasEven = false;
        for (int temp : arr) {
            if (temp == 0) continue;
            else if (temp % 2 == 0) hasEven = true;
            else hasOdd = true;
        }

        if (hasEven && !hasOdd) bw.write("0");
        else if (!hasEven && hasOdd) bw.write("1");
        else bw.write("2");
        bw.flush();
    }
}