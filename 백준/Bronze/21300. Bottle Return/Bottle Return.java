import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        for(int i=0; i<6; i++) {
            res += sc.nextInt()*5;
        }
        System.out.println(res);
    }
}