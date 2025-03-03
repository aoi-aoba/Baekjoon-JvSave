import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine()), res = 0;
        // long 뒤에 Integer.parseInt를 붙이는 멍청한 짓;;;
        for(long i = 1; i <= s+1; i++) {
            if(s - i < 0) break;
            s -= i;
            res = i;
        }
        System.out.println(res);
        br.close();
    }
}

/*
서로 다른 N개의 자연수의 합이 S일 때 N이 최대이려면 자연수는 모두 작은 자연수의 경우여야 하므로,
1부터 for문을 억지로 돌려서 찾아보면서 대강 째리다가 다음 수가 작으면 그 안에서 어떻게 커버 된다는거니까
그게 답 되는거임 ㅋ
 */