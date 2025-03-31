import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] str = br.readLine().toCharArray();
        boolean vowelOccur = false;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'a' || str[i] == 'i' || str[i] == 'u' || str[i] == 'o' || str[i] == 'e') {
                if (!vowelOccur) vowelOccur = true;
                else {
                    vowelOccur = false;
                    str[i] = '*';
                }
            } else if (str[i] == 'p' && vowelOccur) str[i] = '*';
        }
        for (char c : str) if (c != '*') System.out.print(c);
        br.close();
    }
}