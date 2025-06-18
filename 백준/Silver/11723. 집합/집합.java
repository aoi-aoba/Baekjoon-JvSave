import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int arrayForBit = 0, M = Integer.parseInt(br.readLine());
        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            int temp;
            switch (op) {
                case "add" :
                    temp = Integer.parseInt(st.nextToken()) - 1;
                    arrayForBit = arrayForBit | (1 << temp);
                    // 1 << temp는 temp번 비트만 1, 그 외는 0으로 만들기 때문에 |로 or 연산을 통해 반영해주면 됨
                    break;
                case "remove" :
                    temp = Integer.parseInt(st.nextToken()) - 1;
                    arrayForBit = arrayForBit & ~(1 << temp);
                    // 1 << temp로 temp번 비트만 1로 만든 상태를 ~로 뒤집으면 지워야 하는 비트만 0이 되어 &로 변경 가능
                    break;
                case "check" :
                    temp = Integer.parseInt(st.nextToken()) - 1;
                    result.append((arrayForBit & (1 << temp)) == (1 << temp) ? 1 : 0).append("\n");
                    break;
                case "toggle" :
                    temp = Integer.parseInt(st.nextToken()) - 1;
                    arrayForBit = arrayForBit ^ (1 << temp);
                    // 1 << temp는 temp번 비트만 1, 그 외는 0으로 만들기 때문에 |로 xor 연산을 통해 조건부 반영해주면 됨
                    break;
                case "all" :
                    arrayForBit = (1 << 20) - 1;
                    break;
                case "empty" :
                    arrayForBit = 0;
                    break;
            }
        }
        System.out.print(result);
    }
}