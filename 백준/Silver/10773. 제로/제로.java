import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stackInt = new Stack<>();
        int N = Integer.parseInt(br.readLine()), sum = 0;
        for(int i=0; i<N; i++) {
            int caseInt = Integer.parseInt(br.readLine());
            if(caseInt == 0) stackInt.pop(); // 지울 수 있음이 보자오딤
            else stackInt.push(caseInt);
        }
        for(int i=0; i<stackInt.size(); i++) sum += stackInt.get(i);
        System.out.println(sum);
        br.close();
    }
}
