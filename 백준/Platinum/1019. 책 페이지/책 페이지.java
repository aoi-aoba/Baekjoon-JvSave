//  책 페이지

import java.util.*;
import java.io.*;

public class Main {
    private static final int[] COUNTER = new int[10];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        solve(N);

        StringBuilder sb = new StringBuilder();
        for (int item : COUNTER)
            sb.append(item).append(" ");

        System.out.println(sb);
    }
    private static void solve(int num) {
        int startPage = 1, digit = 1;
        while (startPage <= num) {
            // 일의 자리가 9가 될 때까지 마지막 페이지 감소
            while (num % 10 != 9 && startPage <= num) {
                // 감소 페이지는 별도로 측정하고
                count(num, digit);
                num--;
            }
            // 마지막 페이지가 시작 페이지보다 작을 경우를 처리하지 않으면 num < 9에 inf
            if (num < startPage) break;
            // 일의 자리가 0이 될 때까지 시작 페이지를 1씩 증가
            while (startPage % 10 != 0 && startPage <= num) {
                // 증가한 페이지 별도로 측정하고
                count(startPage, digit);
                startPage++;
            }
            startPage /= 10; num /= 10;
            for (int i = 0; i < 10; i++)
                COUNTER[i] += (num - startPage + 1) * digit;
            digit *= 10;
        }
    }
    private static void count(int num, int digit) {
        while (num > 0) {
            COUNTER[num % 10] += digit;
            num /= 10;
        }
    }
}