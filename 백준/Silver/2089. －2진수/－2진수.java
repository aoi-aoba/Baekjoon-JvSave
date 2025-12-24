//  -2진수

import java.util.*;
import java.io.*;

public class Main {
    public static void convert(long N) {
        Stack<Integer> stack = new Stack<>();
        while (N != 1) {
            int mod = (int)(N % -2);
            stack.push(mod < 0 ? -mod : mod);
            N = (int) Math.ceil((double) N / -2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(1));
        while (!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        if (0 <= N && N <= 1) System.out.println(N);
        else convert(N);
    }
}