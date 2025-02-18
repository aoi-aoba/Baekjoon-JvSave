import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++) {
            for(int j=N-i; j>0; j--)
                System.out.print(" ");
            for(int k=i; k>0; k--)
                System.out.print("*");
            System.out.println();
        }
    }
}