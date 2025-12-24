//  신기한 소수

import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] numArr = {1, 3, 5, 7, 9};
    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
    public static void tracker(int num) {
        if (!isPrime(num)) return;
        if (String.valueOf(num).length() == n) {
            System.out.println(num);
            return;
        }
        for (int i : numArr) tracker(num * 10 + i);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tracker(2);
        tracker(3);
        tracker(5);
        tracker(7);
    }
}