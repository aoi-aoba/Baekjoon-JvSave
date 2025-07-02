import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        char[] op = new char[2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        op[0] = st.nextToken().charAt(0);
        arr[1] = Integer.parseInt(st.nextToken());
        op[1] = st.nextToken().charAt(0);
        arr[2] = Integer.parseInt(st.nextToken());

        int res1 = 0, res2 = 0;

        // res1이 후위부터 계산
        if (op[1] == '+') res1 += arr[1] + arr[2];
        else if (op[1] == '-') res1 += arr[1] - arr[2];
        else if (op[1] == '*') res1 += arr[1] * arr[2];
        else res1 += arr[1] / arr[2];
        if (op[0] == '+') res1 = arr[0] + res1;
        else if (op[0] == '-') res1 = arr[0] - res1;
        else if (op[0] == '*') res1 = arr[0] * res1;
        else res1 = arr[0] / res1;


        if (op[0] == '+') res2 += arr[0] + arr[1];
        else if (op[0] == '-') res2 += arr[0] - arr[1];
        else if (op[0] == '*') res2 += arr[0] * arr[1];
        else res2 += arr[0] / arr[1];
        if (op[1] == '+') res2 = res2 + arr[2];
        else if (op[1] == '-') res2 = res2 - arr[2];
        else if (op[1] == '*') res2 = res2 * arr[2];
        else res2 = res2 / arr[2];

        System.out.println(Math.min(res1, res2));
        System.out.println(Math.max(res1, res2));
    }
}