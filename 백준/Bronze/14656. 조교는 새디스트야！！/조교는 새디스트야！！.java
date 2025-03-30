import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader 완충기억기독자 = new BufferedReader(new InputStreamReader(System.in));
        int 현우네반학생수 = Integer.parseInt(완충기억기독자.readLine()), 잘못선학생수 = 0;
        StringTokenizer 문자열분리자 = new StringTokenizer(완충기억기독자.readLine());
        for(int 색인 = 1; 색인 <= 현우네반학생수; 색인++) {
            int 학생번호 = Integer.parseInt(문자열분리자.nextToken());
            if(학생번호 != 색인) 잘못선학생수++;
        }
        System.out.println(잘못선학생수);
        완충기억기독자.close();
    }
}