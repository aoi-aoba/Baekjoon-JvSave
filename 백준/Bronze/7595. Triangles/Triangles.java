import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            int temp = sc.nextInt();
            if(temp == 0) break;
            for(int i=1; i<=temp; i++) {
                for(int j=1; j<=i; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}