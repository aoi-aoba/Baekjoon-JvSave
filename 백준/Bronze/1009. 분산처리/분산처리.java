import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int base = Integer.parseInt(st.nextToken()); // 100 이하의 양의 정수
            int exponent = Integer.parseInt(st.nextToken()); // 100만 이하의 양의 정수
            int oneDigit = base % 10;
            for(int j=1; j<exponent; j++) {
                oneDigit *= base;
                oneDigit %= 10;
            }
            if(oneDigit == 0) oneDigit = 10;
            sb.append(oneDigit).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}

/*
T개의 케이스에 대해서 a^b개의 데이터
데이터의 1의 자리수가 컴퓨터를 결정하므로
a^b를 굳이 한번에 계산하지 않아도 일의 자리만 출력해도 될듯
가령 7^4인 경우 7*7*7*7이 아니라
7*7 = 49 >> 9*7 = 63 >> 3*7 = 21로 1을 뽑아내면 될듯
 */