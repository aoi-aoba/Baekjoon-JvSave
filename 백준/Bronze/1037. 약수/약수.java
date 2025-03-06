import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int realDivisorNum = Integer.parseInt(br.readLine());
        int[] realDivisorArr = new int[realDivisorNum];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<realDivisorNum; i++) {
            realDivisorArr[i] = Integer.parseInt(st.nextToken());
        }
        if(realDivisorNum == 1) {
            System.out.println(realDivisorArr[0] * realDivisorArr[0]);
        } else {
            Arrays.sort(realDivisorArr); // 임의로 주어질 경우 최대최소를 구해야 하므로
            System.out.println(realDivisorArr[0] * realDivisorArr[realDivisorNum - 1]);
        }
        br.close();
    }
}

/*
N의 약수에 대하여 A가 1과 N이 아닌 모든 약수를 진짜 약수라고 한다면
진짜 약수의 최소와 최대의 곱은 N이다 (1이 아닌 최소의 약수가 나올 것이므로 N/최소약수 = 최대약수)
1과 자기 자신만을 가지는 소수는 나올수 없고, 소수의 제곱수들은 한 개만을 인수로 가질텐데
이 인수를 그냥 두 번 곱해주면 N이 나올 것이다 (가령, 9는 3만 나올 것이므로 3^2=9)
 */