import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine()), res = 0;
        while (true) {
            if (input < 10) break;
            int temp = 1;
            while (input > 0) {
                temp *= input % 10;
                input /= 10;
            }
            input = temp;
            res++;
        }
        System.out.println(res);
    }
}