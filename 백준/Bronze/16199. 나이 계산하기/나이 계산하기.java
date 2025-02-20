import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int y=s.nextInt(), m=s.nextInt(), d=s.nextInt();
        int y1=s.nextInt(), m1=s.nextInt(), d1=s.nextInt();

        int sum=0;
        if(m<m1) sum=y1-y;
        else if(m==m1 && d<=d1) sum=y1-y;
        else sum=y1-y-1;

        System.out.println(sum);
        System.out.format("%d\n",y1-y+1);
        System.out.format("%d",y1-y);
    }
}