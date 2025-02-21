import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        for(int i=0; i<6; i++)
            if(sc.next().equals("W")) score++;
        if(score >= 5) System.out.println(1);
        else if(score >= 3) System.out.println(2);
        else if(score >= 1) System.out.println(3);
        else System.out.println(-1);
    }
}