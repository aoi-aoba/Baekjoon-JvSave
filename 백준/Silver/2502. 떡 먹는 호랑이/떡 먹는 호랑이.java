import java.io.*;
import java.util.*;

public class Main {
    public static int[] arrX = new int[31], arrY = new int[31];
    public static void setArrDp() {
        arrX[1] = arrY[2] = 1;
        arrX[2] = arrY[1] = 0;
        for (int i = 3; i < 31; i++) {
            arrX[i] = arrX[i - 2] + arrX[i - 1];
            arrY[i] = arrY[i - 2] + arrY[i - 1];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        setArrDp();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int a = arrX[d], b = arrY[d];

        int A = 0, B;
        for (B = k / b; B >= 0; B--) {
            if ((k - (b * B)) % a == 0) {
                A = (k - b * B) / a;
                if (A <= B && A >= 1) break;
            }
        }

        bw.write(String.valueOf(A) + "\n");
        bw.write(String.valueOf(B) + "\n");
        bw.flush();
    }
}