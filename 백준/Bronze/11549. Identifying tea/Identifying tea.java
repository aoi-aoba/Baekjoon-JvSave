import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int realTea = 0;
        int teaType =  sc.nextInt();
        for(int i=0; i<5; i++) {
            if(sc.nextInt() == teaType) realTea++;
        }
        System.out.println(realTea);
    }
}