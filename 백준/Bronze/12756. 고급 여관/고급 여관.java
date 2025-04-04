import java.io.*;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" "), str2 = br.readLine().split(" ");
        int A1 = Integer.parseInt(str1[0]), A2 = Integer.parseInt(str1[1]);
        int B1 = Integer.parseInt(str2[0]), B2 = Integer.parseInt(str2[1]);
        while (A2 > 0 && B2 > 0) {
            A2 -= B1;
            B2 -= A1;
        }
        if (A2 <= 0 && B2 <= 0) bw.write("DRAW");
        else if (A2 > B2) bw.write("PLAYER A");
        else bw.write("PLAYER B");
        bw.flush();
    }
}