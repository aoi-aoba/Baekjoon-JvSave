import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrlist = new ArrayList<>(Arrays.asList(9,7,8,0,9,2,1,4,1,8));

        arrlist.add(a);
        arrlist.add(b);
        arrlist.add(c);

        int answer = 0;
        for(int i=0; i<arrlist.size(); i++){
            if(i%2==0) answer += arrlist.get(i);
            else answer = answer + 3*arrlist.get(i);
        }

        System.out.println("The 1-3-sum is " + answer);
    }
}