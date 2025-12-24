import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10_000_001];

        for (int i = 2; i < arr.length; i++) arr[i] = i;
        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            if (arr[i] == 0) continue;
            for (int j = i * i; j < arr.length; j += i) arr[j] = 0;
        }

        int i = n;
        while (true) {
            if (arr[i] != 0) {
                if (isPalindrome(arr[i])) {
                    System.out.println(arr[i]);
                    return;
                }
            }
            i++;
        }
    }

    private static boolean isPalindrome(int result) {
        char[] temp = String.valueOf(result).toCharArray();
        int s = 0, e = temp.length - 1;
        while (s < e) {
            if (temp[s] != temp[e]) return false;
            s++; e--;
        }
        return true;
    }
}
