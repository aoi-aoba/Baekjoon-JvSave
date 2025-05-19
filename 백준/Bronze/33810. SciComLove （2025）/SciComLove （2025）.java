import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(), std = "SciComLove";
        int res = 0;
        for (int i = 0; i < 10; i++)
            if (str.charAt(i) != std.charAt(i)) res++;
        System.out.println(res);
    }
}