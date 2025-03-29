import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bottle = Integer.parseInt(st.nextToken());
        bottle += Integer.parseInt(st.nextToken());
        int needBottle = Integer.parseInt(st.nextToken()), drinkBottle = 0;
        while (bottle >= needBottle) {
            int temp = bottle / needBottle; // 가져간 병의 개수를 바꿀때 필요한 병으로 나누고
            drinkBottle += temp; // 그만큼 새로 마실수 있다
            bottle %= needBottle; // 병을 바꾸고 남은 개수
            bottle += temp; // 그만큼 새로 빈 병도 생긴다
        }
        System.out.println(drinkBottle);
        br.close();
    }
}