import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] str = br.readLine().toCharArray();
        int[] arr = new int[10];
        int sum = 0;

        Arrays.fill(arr, 0);
        for (char ch : str) {
            sum += (ch - '0');
            arr[ch-'0']++;
        }
        
        if (sum % 3 == 0 && arr[0] > 0) {
            for (int i = 9; i >= 0; i--) {
                while (arr[i] != 0) {
                    sb.append(i);
                    arr[i]--;
                }
            }
        } else sb.append(-1);

        System.out.println(sb);
        br.close();
    }
}