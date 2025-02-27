import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> oddArray = new ArrayList<>();
        int res = 0;
        for(int i=0; i<7; i++) {
            int temp = Integer.parseInt(br.readLine());
            if(temp % 2 == 1) {
                res += temp;
                oddArray.add(temp);
            }
        }
        if(oddArray.isEmpty()) {
            System.out.println(-1);
            return;
        }
        Collections.sort(oddArray);
        System.out.println(res);
        System.out.println(oddArray.get(0));
        br.close();
    }
}