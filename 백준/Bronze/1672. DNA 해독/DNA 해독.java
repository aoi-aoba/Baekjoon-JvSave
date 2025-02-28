import java.io.*;
import java.util.*;

public class Main {
    public static int parseToNum(char c) {
        if(c == 'A') return 0;
        else if(c == 'G') return 1;
        else if(c == 'C') return 2;
        else return 3;
    }

    public static char[][] arr = {{'A', 'C', 'A', 'G'},
                                    {'C', 'G', 'T', 'A'},
                                    {'A', 'T', 'C', 'G'},
                                    {'G', 'A', 'G', 'T'}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] strDNA = br.readLine().toCharArray();
        while(N > 1) {
            strDNA[N-2] = arr[parseToNum(strDNA[N-1])][parseToNum(strDNA[N-2])];
            N--;
        }
        System.out.println(strDNA[0]);
        br.close();
    }
}