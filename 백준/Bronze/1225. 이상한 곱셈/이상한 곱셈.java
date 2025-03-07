import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrA = new int[10000], arrB = new int[10000];
        char[] str1 = st.nextToken().toCharArray(), str2 = st.nextToken().toCharArray();
        long res = 0;
        for(int i=0; i<str1.length; i++) arrA[i] = str1[i] - '0';
        for(int i=0; i<str2.length; i++) arrB[i] = str2[i] - '0';
        for(int i=0; i<str1.length; i++)
            for(int j=0; j<str2.length; j++)
                res += (long) arrA[i] * arrB[j];
        System.out.println(res);
    }
}