import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_VALUE = 2100000000;
    public static ArrayList<Integer> getSquareList() {
        ArrayList<Integer> squareNumList = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(MAX_VALUE); i++)
            squareNumList.add(i*i);
        return squareNumList;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), cnt = 0;
        ArrayList<Integer> squareList = getSquareList();
        for(int i=0; i<squareList.size(); i++) {
            if(squareList.get(i) <= N) cnt++;
            else break;
        }
        System.out.println(cnt);
        br.close();
    }
}

