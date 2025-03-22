import java.util.*;
import java.io.*;

public class Main {
    public static int recursive(int first, int second, int depth, boolean needPrint) {
        if(needPrint) System.out.print(first + " "); // 출력해야 되면 계속 끌고 가면서 진행하고
        int result = first - second;
        if(result < 0) {
            if(needPrint) System.out.print(second + " ");
            // 결론이 음수로 나게 된다면 여기가 마지막일 것이니까 딱 second 까지만 출력하면 됨
            return depth; // 깊이 반환하고 바로 끝
        }
        return recursive(second, result, depth + 1, needPrint);
        // 더 진행 가능하면 second를 first로 하고 result가 뺀 값으로서 주어짐
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int secondNum = 0, maxDepth = 1;
        for(int i = N; i >= 0; i--) {
            int depthCase = recursive(N, i, 1, false);
            // i를 N부터 줄여나가면서 값을 반복적으로 생성하고 깊이 1로 제공하여 출력하지 않고 진행
            if(maxDepth < depthCase) {
                // return 값이 항상 '최종적으로는' 깊이를 반환하게 되어 있음
                secondNum = i;
                maxDepth = depthCase;
            }
        }
        System.out.println(maxDepth+1);
        recursive(N, secondNum, 1, true);
    }
}

/*
브루트 포스 알고리즘을 활용하여 직접 구현해보는 게 가장 빠를 것 같다.
첫 수가 최대 30000 이내에서 주어지니까 두 번째 수는 첫 수 이내에서 0까지 줄여나가면서 체크한다.
 */