import java.io.*;
import java.util.*;

public class Main {
    public static int N;

    public static boolean nextPermutation(char[] arr) {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) i--;
        if (i <= 0) return false;

        int j = arr.length - 1;
        while (arr[j] <= arr[i - 1]) j--;

        char temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        int start = i, end = arr.length - 1;
        while (start < end) {
            char t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder out = new StringBuilder();

        String input = br.readLine();
        char[] arr = input.toCharArray();

        if (nextPermutation(arr)) out.append(new String(arr));
        else out.append(0);

        bw.write(out.toString());
        bw.flush();
    }
}