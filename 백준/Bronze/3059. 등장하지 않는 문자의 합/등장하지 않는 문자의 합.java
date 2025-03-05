import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            // for문이 새로 돌 때 마다 answer를 초기화한다.
            int answer = 0;
            // 알파벳 26개를 담을 배열 선언
            boolean [] abc = new boolean[26];

            // forEach문을 통해 사용된 알파벳을 true로 바꾼다.
            for (char ch : str.toCharArray()) {
                abc[ch - 'A'] = true;
            }

            // for문을 돌려 사용되지 않은 알파벳의 아스키코드값을 더한다.
            for (int j = 0; j < 26; j++) {
                if (!abc[j]){
                    answer += 'A' + j;
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}