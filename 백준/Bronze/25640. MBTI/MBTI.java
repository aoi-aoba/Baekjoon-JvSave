import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N = Integer.parseInt(sc.nextLine());
        int sameMBTI = 0;
        for(int i=0; i<N; i++) {
            if(s.equals(sc.nextLine())) sameMBTI++;
        }
        System.out.println(sameMBTI);
    }
}