import java.util.*;
import java.io.*;

public class Main {
    public static int hanSu(int n) {
        int cnt = 0;
        // n을 직접 받아서 개수를 반환하는 한수 메소드
        if (n < 100) cnt = n; // n이 100보다 작다면 99까지는 자기 자신까지 모두 등차임
        else {
            cnt += 99;
            for (int i = 111; i <= n; i++) {
                String str = String.valueOf(i);
                if (str.charAt(1) - str.charAt(0) == str.charAt(2) - str.charAt(1)) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(hanSu(N));
        br.close();
    }
}

// 한 자리와 두 자리는 모두 등차수열로 간주
// 세 자리는 직접 등차수열인지 아닌지 찾으면 될듯