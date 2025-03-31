import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int 택희 = 0, 영훈 = 0, 남규 = 0, cnt = 0;
        for (택희 = 2; 택희 <= N; 택희 += 2) {
            // 택희는 0개를 받을 수 없고 짝수개를 받아야 하므로 택희 중심으로 for loop
            int tempForTwo = N - 택희;
            if(tempForTwo > 3) {
                // 택희를 제외한 둘에 대해 남규 = 영훈 + 2 (최소조건)이라 치면 남규 + 영훈 = 2 * 영훈 + 2임에 따라 4개 이상이어야 함
                for (영훈 = 1; 영훈 < tempForTwo; 영훈++) {
                    남규 = tempForTwo - 영훈;
                    if (남규 - 영훈 >= 2 && 남규 != 0 && 택희 != 0) cnt++;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}