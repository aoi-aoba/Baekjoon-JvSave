import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), result = 0;
        ArrayList<String> ansList = new ArrayList<>();
        for (int i = 0; i < N; i++) ansList.add(br.readLine());
        for (int i = 0; i < N; i++) if (ansList.get(i).equals(br.readLine())) result++;

        bw.write(String.valueOf(result));
        bw.flush();
    }
}