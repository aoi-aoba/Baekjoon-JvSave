import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int R = 0, C = 0;
        for(int i=1; i<=Math.sqrt(str.length()); i++) {
            if(str.length() % i == 0) {
                R = i;
                C = str.length() / R;
            }
        }
        char[][] arr = new char[R][C];
        for(int i=0; i<C; i++)
            for(int j=0; j<R; j++)
                arr[j][i] = str.charAt(i * R + j);
        for(int i=0; i<R; i++)
            for(int j=0; j<C; j++)
                System.out.print(arr[i][j]);
        br.close();
    }
}