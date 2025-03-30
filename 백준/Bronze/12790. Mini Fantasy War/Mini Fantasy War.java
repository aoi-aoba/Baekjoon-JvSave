import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader 완충기억기독자 = new BufferedReader(new InputStreamReader(System.in));
        int 실험사례 = Integer.parseInt(완충기억기독자.readLine());
        for(int 색인 = 1; 색인 <= 실험사례; 색인++) {
            StringTokenizer 문자열분리자 = new StringTokenizer(완충기억기독자.readLine());
            int 체력 = Integer.parseInt(문자열분리자.nextToken());
            int 마법력 = Integer.parseInt(문자열분리자.nextToken());
            int 공격력 = Integer.parseInt(문자열분리자.nextToken());
            int 방어력 = Integer.parseInt(문자열분리자.nextToken());

            int 체력변동치 = Integer.parseInt(문자열분리자.nextToken());
            체력 = 체력 + 체력변동치 < 1 ? 1 : 체력 + 체력변동치;
            int 마법력변동치 = Integer.parseInt(문자열분리자.nextToken());
            마법력 = 마법력 + 마법력변동치 < 1 ? 1 : 마법력 + 마법력변동치;
            int 공격력변동치 = Integer.parseInt(문자열분리자.nextToken());
            공격력 = 공격력 + 공격력변동치 < 0 ? 0 : 공격력 + 공격력변동치;
            int 방어력변동치 = Integer.parseInt(문자열분리자.nextToken());
            방어력 = 방어력 + 방어력변동치;

            System.out.println(체력 + 마법력 * 5 + 공격력 * 2 + 방어력 * 2);
        }
        완충기억기독자.close();
    }
}