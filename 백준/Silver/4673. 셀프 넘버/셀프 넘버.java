import java.io.*;
import java.util.*;

public class Main {
    public static void selfNum(boolean[] array) {
        for(int i=1; i<10001; i++) {
            if(i < 10) array[i+i] = false;
            else if(i < 100) array[i+(i%10)+(i/10)] = false;
            else if(i < 1000) array[i+(i%10)+(i/10%10)+(i/100)] = false;
            else {
                int temp = i + (i % 10) + (i / 10 % 10) + (i / 100 % 10) + (i / 1000);
                if(temp < 10001) array[temp] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[10001];
        Arrays.fill(arr, true);
        selfNum(arr);
        for(int i=1; i<10001; i++)
            if(arr[i]) System.out.println(i);
    }
}