import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine()); // 100 이상 20억 이하
        long F = Long.parseLong(br.readLine()); // 위에가 long이니까 안정적으로
        N = N - N % 100;
        long remainder = N % F;
        if(remainder == 0) System.out.println("00");
        else {
            long res = F - remainder;
            if(res < 10) System.out.print("0");
            System.out.println(res);
        }
        br.close();
    }
}

/*
N이라는 수가 100 이상으로 주어지기 때문에 그냥 일/십의 자리를 없애고
남은 부분을 F라는 수로 나눈 나머지를 구해 그 나머지를 0으로 만들 가장 작은 수를 더하자.
가령, 275고 6이라 하면, 200/6=33(나머지 2)이므로 6-2=4를 더한 204의 뒷 두자리 04를 출력하면 된다.
 */