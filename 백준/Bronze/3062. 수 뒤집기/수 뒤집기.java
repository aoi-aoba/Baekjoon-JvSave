import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader 완충기억기독자 = new BufferedReader(new InputStreamReader(System.in));
        int 실험사례 = Integer.parseInt(완충기억기독자.readLine());
        for(int 색인 = 0; 색인 < 실험사례; 색인++) {
            int 정수 = Integer.parseInt(완충기억기독자.readLine());
            StringBuilder 문자열생성자 = new StringBuilder(String.valueOf(정수));
            int 뒤집은정수 = Integer.parseInt(문자열생성자.reverse().toString());
            int 정수합 = 정수 + 뒤집은정수;
            if(String.valueOf(정수합).equals(new StringBuilder(String.valueOf(정수합)).reverse().toString()))
                System.out.println("YES");
            else System.out.println("NO");
        }

        완충기억기독자.close();
    }
}