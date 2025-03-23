import java.util.*;
import java.io.*;

public class Main {
    public static final int MILLION_SIZE = 1000001;
    public static int[] primeSieveMil() {
        int[] arr = new int[MILLION_SIZE];
        for (int i = 2; i < MILLION_SIZE; i++) arr[i] = i;
        for (int i = 2; i <= 1001; i++) { // 100만에 대하여 1000이 sqrt(100만)이니까
            if (arr[i] == 0) continue;
            for (int j = 2 * i; j < MILLION_SIZE; j += i) arr[j] = 0;
        }
        return arr;
    }
    public static ArrayList<Integer> getPrimeList(int[] arr) {
        ArrayList<Integer> primeList = new ArrayList<>();
        primeList.add(2);
        for (int i = 3; i < arr.length; i++)
            if(arr[i] != 0) primeList.add(arr[i]);
        return primeList;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] primeArr = primeSieveMil();
        ArrayList<Integer> primeList = getPrimeList(primeArr);
        for(int i=0; i<N; i++) {
            int targetNum = Integer.parseInt(br.readLine()), j = 0, cnt = 0;
            while(true) {
                int primeToFind = targetNum - primeList.get(j);
                if (primeToFind < targetNum/2) break;
                else {
                    if(primeToFind == 2) cnt++;
                    else if(primeArr[primeToFind] != 0) cnt++;
                }
                j++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}