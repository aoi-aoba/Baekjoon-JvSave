import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine(), str2 = br.readLine();
        int[] arr = new int[16];
        for (int i = 0; i < 8; i++) {
            arr[2 * i] = str1.charAt(i) - '0';
            arr[2 * i + 1] = str2.charAt(i) - '0';
        }
        for (int i = 14; i >= 1; i--) {
            for (int j = 0; j <= i; j++) {
                arr[j] = arr[j] + arr[j + 1];
                if(arr[j] >= 10) arr[j] %= 10;
            }
            arr[i+1] = 0;
        }
        System.out.println(arr[0] + "" + arr[1]);
        br.close();
    }
}