import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int result = 0;    // 결과
        int[] sides = new int[3];    // 세변을 저장할 배열 변수

        for(int i=0; i < 3; i++) {
            sides[i] = sc.nextInt();
        }

        Arrays.sort(sides);    // 오름차순 정렬

        while(true) {

            // 모두 변일 동일할 떄
            if(sides[0] == sides[1] && sides[1] == sides[2]) {
                result = sides[0] + sides[1] + sides[2];
                break;
            }
            // 삼각형의 조건에 부합되지 않는 경우(가장 큰 길이를 -1 함)
            else if(sides[2] >= sides[0] + sides[1]) {
                sides[2] -= 1;
            }
            else {
                result = sides[0] + sides[1] + sides[2];
                break;
            }

        }

        System.out.println(result);
    }
}