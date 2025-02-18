import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()), res = 0;
        while(true) {
            if(n < 1) break;
            n--;
            int temp = Integer.parseInt(br.readLine());
            sb.append(temp + " " + temp + "\n");
        }
        System.out.print(sb);
    }
}