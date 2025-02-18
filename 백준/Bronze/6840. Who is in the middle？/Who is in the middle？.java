import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A>=B && A<=C) System.out.println(A);
        else if(A<=B && A>=C) System.out.println(A);
        else if(B>=A && B<=C) System.out.println(B);
        else if(B<=A && B>=C) System.out.println(B);
        else System.out.println(C);
    }
}