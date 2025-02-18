import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String a = br.readLine();
        int sum = 0;
        for(int i=0; i<N; i++) sum += a.charAt(i)-'0';
        System.out.println(sum);
    }
}