import java.util.*;
import java.io.*;

public class Main {
    public static int Euclidean(int a, int b) {
        while(b > 0) {
            int b_store = b;
            b = a % b;
            a = b_store;
        }
        return a;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), gcd = Integer.MAX_VALUE, start = 0, end = 0;
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(i == 0) start = arr[i];
            if(i == N-1) end = arr[i];
        }
        for(int i=1; i<N; i++) {
            int dist = arr[i] - arr[i-1];
            if(i == 1) gcd = dist;
            else gcd = Euclidean(gcd, dist);
        }
        System.out.println((end-start) / gcd + 1 - N);
    }
}

/*
가로수의 위치가 주어지면 각각의 사이 간격을 조사한다.
각각의 사이 간격에 대해 최대공약수를 구하면 그것이 새 나무를 심었을때 잡아야 할 등간격이 된다.
해당 등간격으로 했을 때 있어야 할 가로수의 총 개수 - 현재 있는 가로수의 개수를 구하면 된다.
 */