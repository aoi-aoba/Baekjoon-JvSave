import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] arr = {'K', 'O', 'R', 'E', 'A'};
        int len = 0, find = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == arr[find]) {
                len++;
                find++;
            }
            if (find == 5) find = 0;
        }

        bw.write(String.valueOf(len));
        bw.flush();
    }
}