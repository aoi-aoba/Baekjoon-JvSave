import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String[] token = sc.next().split("-");
            int remainingDays = Integer.parseInt(token[1]);

            if (remainingDays <= 90) {
                count++;
            }
        }

        System.out.println(count);
    }
}