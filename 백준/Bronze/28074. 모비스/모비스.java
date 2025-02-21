import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int M = 1, O = 1, B = 1, I = 1, S = 1;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'M') M--;
            else if(str.charAt(i) == 'O') O--;
            else if(str.charAt(i) == 'B') B--;
            else if(str.charAt(i) == 'I') I--;
            else if(str.charAt(i) == 'S') S--;
        }
        if(M < 1 && O < 1 && B < 1 && I < 1 && S < 1)
            System.out.println("YES");
        else System.out.println("NO");
    }
}