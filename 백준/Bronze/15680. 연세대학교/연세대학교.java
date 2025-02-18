import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        switch(N) {
            case 0:
                System.out.println("YONSEI");
                break;
            case 1:
                System.out.println("Leading the Way to the Future");
        }
    }
}