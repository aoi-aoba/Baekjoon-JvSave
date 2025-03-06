import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0, num = Integer.parseInt(br.readLine());
        int init = num;
        while(true) {
            int a = num / 10;
            int b = num % 10;
            num = b * 10 + (a + b) % 10;
            cnt++;
            if(num == init) break;
        }
        System.out.println(cnt);
        br.close();
    }
}

/*
10보다 작으면 0 붙이고, 수 자리합 a*10+b면 a+b 구하고
b*10 + (a+b)%10으로 새로운 수 만들기
 */