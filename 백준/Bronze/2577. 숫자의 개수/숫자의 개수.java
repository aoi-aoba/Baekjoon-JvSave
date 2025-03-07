import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numArr = new int[10];
        Arrays.fill(numArr, 0);

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String res = String.valueOf(a * b * c);
        for(int i=0; i<res.length(); i++)
            numArr[res.charAt(i) - '0']++;
        for(int i=0; i<10; i++)
            System.out.println(numArr[i]);
        br.close();
    }
}