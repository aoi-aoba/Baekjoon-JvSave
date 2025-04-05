import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[] {1, 2, 6, 24, 120};
        while(true) {
            String str = String.valueOf(new StringBuilder(br.readLine()).reverse());
            if(Integer.parseInt(str) == 0) break;
            int res = (!str.isEmpty() ? str.charAt(0) - '0' : 0)
                    + (str.length() >= 2 ? (str.charAt(1) - '0') * arr[1] : 0)
                    + (str.length() >= 3 ? (str.charAt(2) - '0') * arr[2] : 0)
                    + (str.length() >= 4 ? (str.charAt(3) - '0') * arr[3] : 0)
                    + (str.length() >= 5 ? (str.charAt(4) - '0') * arr[4] : 0);
            System.out.println(res);
        }
        br.close();
    }
}