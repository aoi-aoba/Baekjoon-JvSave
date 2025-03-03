import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int max = 0;
        String num = br.readLine();
        for(int i=0; i<num.length(); i++) {
            int val = Integer.parseInt(String.valueOf(num.charAt(i)));
            if(val == 9) val = 6;
            arr[val]++;
        }
        arr[6] = (arr[6] % 2 == 0) ? arr[6]/2 : arr[6]/2+1;
        for(int i=0; i<9; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
        br.close();
    }
}

/*
6은 9와 같다고 두고, 나머지는 뭐 의미 없으니까 str로 받아서
크기 9짜리 int 배열 대충 두고 하나씩 째리면서 6이랑 9는 6에다 대충 둬서
개수 최대인거 출력하면 그만일듯
 */