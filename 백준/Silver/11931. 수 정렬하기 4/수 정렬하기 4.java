import java.util.*;
import java.io.*;

public class Main {
    public static boolean[] arr = new boolean[2000001];
    // 수가 중복되지 않고 주어지므로 int-type 배열보다 유무만 확인해서 빠르게 넘기는게 메모리상 유리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine()), max = -1000001, min = 1000001;
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr[temp+1000000] = true;
            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }
        for (int i = max; i >= min; i--) if (arr[i+1000000]) sb.append(i).append("\n");
        System.out.print(sb.toString());
    }
}

/*
계수 정렬의 역이용 : 배열 내에 값을 저장하면서 출력할 때만 역으로 출력해주면 될 것 같다
조금 더 성능을 개선하기 위해 불필요한 배열을 돌지 않게 max/min 체크를 진행해주자
 */