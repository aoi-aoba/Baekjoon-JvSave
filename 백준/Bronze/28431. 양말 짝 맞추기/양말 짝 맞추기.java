import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        Arrays.fill(arr, 0);
        for(int i=0; i<5; i++) {
            int temp = sc.nextInt();
            arr[temp]++;
        }
        sc.close();
        for(int i=0; i<10; i++) {
            if(arr[i] % 2 != 0)
                System.out.println(i);
        }
    }
}