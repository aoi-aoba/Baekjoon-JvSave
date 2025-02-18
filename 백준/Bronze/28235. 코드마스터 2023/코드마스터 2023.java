import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.equals("SONGDO")) System.out.println("HIGHSCHOOL");
        if(str.equals("CODE")) System.out.println("MASTER");
        if(str.equals("2023")) System.out.println("0611");
        if(str.equals("ALGORITHM")) System.out.println("CONTEST");
    }
}