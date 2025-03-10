import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder arr1 = new StringBuilder(st.nextToken()).reverse();
        StringBuilder arr2 = new StringBuilder(st.nextToken()).reverse();
        int num1 = Integer.parseInt(String.valueOf(arr1));
        int num2 = Integer.parseInt(String.valueOf(arr2));
        int sum = num1 + num2;
        System.out.println(Integer.parseInt(String.valueOf(new StringBuilder(String.valueOf(sum)).reverse())));
        br.close();
    }
}