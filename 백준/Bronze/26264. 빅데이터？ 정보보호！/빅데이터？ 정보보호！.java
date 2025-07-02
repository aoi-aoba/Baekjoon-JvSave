import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine()), sec = 0, big = 0;
        String str = br.readLine();
        for (int i = 0; i < str.length();) {
            if (str.charAt(i) == 's') {
                sec++;
                i += 8;
            } else {
                big++;
                i += 7;
            }
        }
        System.out.println(sec > big ? "security!" : sec < big ? "bigdata?" : "bigdata? security!");
        br.close();
    }
}