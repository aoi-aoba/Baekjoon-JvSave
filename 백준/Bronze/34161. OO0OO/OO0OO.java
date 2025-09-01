import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) br.readLine();
        for (int i = 0; i < 10000; i++) sb.append(-1).append("\n");
        bw.write((sb.toString()));
        bw.flush();
    }
}