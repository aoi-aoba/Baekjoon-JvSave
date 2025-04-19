import java.io.*;
import java.util.*;

public class Main {
    public static long[] padovanSeq = new long[101];
    public static void setSequence() {
        padovanSeq[0] = padovanSeq[1] = padovanSeq[2] = 1;
        padovanSeq[3] = padovanSeq[4] = 2;
        for (int i = 5; i < 101; i++) padovanSeq[i] = padovanSeq[i-1] + padovanSeq[i-5];
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        setSequence();
        while (T-- > 0) sb.append(padovanSeq[Integer.parseInt(br.readLine())-1]).append("\n");
        System.out.print(sb);
    }
}