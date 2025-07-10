import java.io.*;
import java.util.*;

public class Main {
    public static int threeCoinType(char a, char b, char c) {
        if (a == 'T' && b == 'T' && c == 'T') return 0;
        else if (a == 'T' && b == 'T' && c == 'H') return 1;
        else if (a == 'T' && b == 'H' && c == 'T') return 2;
        else if (a == 'T' && b == 'H' && c == 'H') return 3;
        else if (a == 'H' && b == 'T' && c == 'T') return 4;
        else if (a == 'H' && b == 'T' && c == 'H') return 5;
        else if (a == 'H' && b == 'H' && c == 'T') return 6;
        else return 7;
    }
    public static String coinType(String str) {
        int[] typeSum = new int[8];
        for (int i = 2; i < 40; i++)
            typeSum[threeCoinType(str.charAt(i-2), str.charAt(i-1), str.charAt(i))]++;
        StringBuilder lineOut = new StringBuilder();
        for (int temp : typeSum)
            lineOut.append(temp).append(" ");
        lineOut.append("\n");
        return lineOut.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();
        int P = Integer.parseInt(br.readLine());
        while (P-- > 0) {
            String coinAllStr = br.readLine();
            out.append(coinType(coinAllStr));
        }
        bw.write(out.toString());
        bw.flush();
    }
}