import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String numOfB = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int decimalVal = Integer.parseInt(numOfB, B);
        System.out.println(decimalVal);
        br.close();
    }
}