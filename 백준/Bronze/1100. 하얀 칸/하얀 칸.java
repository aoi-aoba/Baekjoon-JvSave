import java.io.*;

public class Main {
    public static int checkWhite(String str, int num) {
        int res = 0;
        if (num % 2 == 0) { // 짝수번째 체스판은 (0,0)이 흰색이므로 (짝,짝)이면 흰색
            for(int i=0; i<str.length(); i++)
                if (str.charAt(i) == 'F' && i % 2 == 0) res++;
        } else { // 홀수번째 체스판은 (1,1)이 흰색이므로 (홀, 홀)이면 흰색
            for(int i=0; i<str.length(); i++)
                if (i % 2 == 1 && str.charAt(i) == 'F') res++;
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int isWhite = 0;
        for(int i=0; i<8; i++) {
            String str = br.readLine();
            isWhite += checkWhite(str, i);
        }
        System.out.println(isWhite);
        br.close();
    }
}