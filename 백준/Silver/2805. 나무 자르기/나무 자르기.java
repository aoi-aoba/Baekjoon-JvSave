import java.io.*;
import java.util.*;

public class Main {
    public static long[] trees;

    // 나무를 얼마나 가져가게 되는지 계산
    public static long calcWood(long height) {
        long sum = 0;
        for (int i = 0; i < trees.length; i++)
            if (trees[i] >= height)
                sum += trees[i] - height;
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int treeNum = Integer.parseInt(st.nextToken()), requireTree = Integer.parseInt(st.nextToken());

        trees = new long[treeNum];
        long max = 0, min = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < treeNum; i++) {
            int tree = Integer.parseInt(st.nextToken());
            trees[i] = tree;
            max = Math.max(max, tree); // 나무의 최고 높이 지정
        }


        long ans = 0;
        while (min <= max) {
            long mid = (min + max) / 2, woods = calcWood(mid);
            // 중간 높이 mid를 계산하고 나무 얼마나 가져가는지 계산한 뒤
            if (woods < requireTree) max = mid - 1;
                // 만약 요구되는 값보다 작다면 더 작게 잘라야 된다는 것
            else {
                ans = mid;
                min = mid + 1;
            } // 그게 아니라면 그걸 일단 답으로 두고, 그것보다 더 크게 잘라도 되지 않는지 체크
        }

        System.out.println(ans);
    }
}