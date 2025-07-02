import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), res = 0;
        char[] arr = br.readLine().toCharArray();
        for (int i = 0; i < arr.length / 2; i++)
            if (arr[i] != arr[N - 1 - i]) res++;
        System.out.println(res);
    }
}